package com.matafe.iniciativaverde.test.member;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.matafe.iniciativaverde.domain.Member;
import com.matafe.iniciativaverde.domain.Site;
import com.matafe.iniciativaverde.service.MemberService;
import com.matafe.iniciativaverde.service.SiteService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml",
		"classpath:/META-INF/spring/applicationContext.xml" })
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class,
		DbUnitTestExecutionListener.class })
@DatabaseSetup(value = { "/META-INF/dbtest/test-data.xml" })
public class MemberServiceTest {

	@Autowired
	private MemberService memberService;

	@Autowired
	private SiteService siteService;

	@Test
	public void testFindByIdNotFound() {
		Member member = memberService.findMember(0L);
		Assert.assertNull(member);
	}

	@Test
	public void testFindById() {
		Member member = memberService.findMember(1001L);
		Assert.assertEquals("Google", member.getName());
	}

	@Test
	public void testCreateMemberSingle() {
		Member member = new Member();
		member.setName("Jose");
		member.setEmail("jose@gmail.com");

		memberService.createMember(member);

		Long id = member.getId();
		Assert.assertNotNull(id);
	}

	@Test
	public void testCreateMemberFull() {
		Member member = new Member();
		member.setName("Mauricio");
		member.setEmail("matafe@gmail.com");

		Site s1 = new Site();
		s1.setUrl("www.matafe.com");
		s1.setPageViews(100L);

		Site s2 = new Site();
		s2.setUrl("www.matafe2.com");
		s2.setPageViews(10L);

		member.addSite(s1);
		member.addSite(s2);

		memberService.createMember(member);

		Long id = member.getId();
		Assert.assertNotNull(id);
	}

	@Test
	public void testUpdateMember() {
		Long id = 1001L;
		String updateSuffix = " LDA";
		Member member = memberService.findMember(id);
		Assert.assertEquals(id, member.getId());
		Assert.assertEquals("Google", member.getName());

		String newName = member.getName() + updateSuffix;

		member.setName(newName);

		memberService.updateMember(member);

		Member memberFound = memberService.findMember(id);
		Assert.assertEquals(newName, memberFound.getName());
	}

	@Test
	public void testDeleteMember() {
		Long id = 1001L;
		Member member = memberService.findMember(id);
		Assert.assertEquals(id, member.getId());
		Assert.assertEquals("Google", member.getName());

		memberService.deleteMember(id);

		Member memberNotFound = memberService.findMember(id);
		Assert.assertNull(memberNotFound);
	}

}
