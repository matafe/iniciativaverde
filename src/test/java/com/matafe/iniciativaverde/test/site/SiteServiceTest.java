package com.matafe.iniciativaverde.test.site;

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
import com.matafe.iniciativaverde.domain.Site;
import com.matafe.iniciativaverde.service.SiteService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml",
		"classpath:/META-INF/spring/applicationContext.xml" })
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class,
		DbUnitTestExecutionListener.class })
@DatabaseSetup(value = { "/META-INF/dbtest/test-data.xml" })
public class SiteServiceTest {
	@Autowired
	private SiteService siteService;

	@Test
	public void testFindByIdNotFound() {
		Site site = siteService.findSite(0L);
		Assert.assertNull(site);
	}

	@Test
	public void testFindById() {
		Site site = siteService.findSite(1001L);
		Assert.assertEquals("www.google.com", site.getUrl());
	}

	@Test
	public void testCreateSite() {
		Site site = new Site();
		site.setUrl("www.matafe.com");

		siteService.createSite(site);

		Long id = site.getId();
		Assert.assertNotNull(id);
	}

	@Test
	public void testUpdateSite() {
		Long id = 1001L;
		String updateSuffix = ".br";
		Site site = siteService.findSite(id);
		Assert.assertEquals(id, site.getId());
		Assert.assertEquals("www.google.com", site.getUrl());

		String newUrl = site.getUrl() + updateSuffix;

		site.setUrl(newUrl);

		siteService.updateSite(site);

		Site siteFound = siteService.findSite(id);
		Assert.assertEquals(newUrl, siteFound.getUrl());
	}

	@Test
	public void testDeleteSite() {
		Long id = 1001L;
		Site site = siteService.findSite(id);
		Assert.assertEquals(id, site.getId());
		Assert.assertEquals("www.google.com", site.getUrl());

		siteService.deleteSite(id);

		Site siteNotFound = siteService.findSite(id);
		Assert.assertNull(siteNotFound);
	}

}
