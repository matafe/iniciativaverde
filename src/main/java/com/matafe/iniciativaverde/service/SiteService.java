package com.matafe.iniciativaverde.service;

import java.util.List;

import com.matafe.iniciativaverde.domain.Member;
import com.matafe.iniciativaverde.domain.Site;

/**
 * <p>
 * Site Service
 * 
 * @author Mauricio Tavares Ferraz
 */
public interface SiteService {

	Site createSite(Site site);

	Site findSite(Long id);

	Site updateSite(Site site);

	void deleteSite(Long id);

	List<Site> findAllSites();

	List<Site> findAllSites(Iterable<Long> ids);

	List<Site> findAllSites(Member member);

}
