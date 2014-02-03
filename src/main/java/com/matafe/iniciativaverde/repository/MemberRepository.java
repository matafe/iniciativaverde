package com.matafe.iniciativaverde.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matafe.iniciativaverde.domain.Member;

/**
 * <p>
 * Member Repository
 * 
 * @author Mauricio Tavares Ferraz
 */
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
