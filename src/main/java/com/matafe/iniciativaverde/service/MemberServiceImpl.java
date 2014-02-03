package com.matafe.iniciativaverde.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matafe.iniciativaverde.domain.Member;
import com.matafe.iniciativaverde.repository.MemberRepository;

/**
 * <p>
 * Member Service Implementation
 * 
 * @author Mauricio Tavares Ferraz
 */
@Service
@Transactional
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberRepository memberRepository;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Member createMember(Member member) {
		memberRepository.save(member);
		return member;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Member findMember(Long id) {
		return memberRepository.findOne(id);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Member updateMember(Member member) {
		memberRepository.save(member);
		return member;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void deleteMember(Long id) {
		memberRepository.delete(id);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Member> findAllMembers() {
		return memberRepository.findAll();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Member> findAllMembers(Iterable<Long> ids) {
		return memberRepository.findAll();
	}

}
