package com.matafe.iniciativaverde.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matafe.iniciativaverde.domain.Member;
import com.matafe.iniciativaverde.domain.Site;

/**
 * <p>
 * Site Repository
 * 
 * @author Mauricio Tavares Ferraz
 */
@Repository
public interface SiteRepository extends JpaRepository<Site, Long> {

	List<Site> findByMember(Member member);

}
