package com.matafe.iniciativaverde.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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

	public final static String FETCH_BY_URL_QUERY = "SELECT s "
			+ "FROM Site s LEFT JOIN FETCH s.owner o LEFT JOIN FETCH s.certificates c WHERE s.url = :url";

	List<Site> findByMember(Member member);

	/**
	 * Fetch the site with it ower by url.
	 */
	@Query(FETCH_BY_URL_QUERY)
	Site fetchSite(@Param("url") String url);

}
