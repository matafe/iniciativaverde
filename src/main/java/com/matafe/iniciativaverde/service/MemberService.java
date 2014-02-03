package com.matafe.iniciativaverde.service;

import java.util.List;

import com.matafe.iniciativaverde.domain.Member;

/**
 * <p>
 * Member Service
 * 
 * @author Mauricio Tavares Ferraz
 */
public interface MemberService {

	Member createMember(Member member);

	Member findMember(Long id);

	Member updateMember(Member member);

	void deleteMember(Long id);

	List<Member> findAllMembers();

	List<Member> findAllMembers(Iterable<Long> ids);

}
