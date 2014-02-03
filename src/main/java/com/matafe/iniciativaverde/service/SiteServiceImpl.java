package com.matafe.iniciativaverde.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matafe.iniciativaverde.domain.Member;
import com.matafe.iniciativaverde.domain.Site;
import com.matafe.iniciativaverde.repository.SiteRepository;

/**
 * <p>
 * Site Service Implementation
 * 
 * @author Mauricio Tavares Ferraz
 */
@Service
@Transactional
public class SiteServiceImpl implements SiteService {

	@Autowired
	private SiteRepository siteRepository;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Site createSite(Site site) {
		siteRepository.save(site);
		return site;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Site findSite(Long id) {
		return siteRepository.findOne(id);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Site updateSite(Site site) {
		siteRepository.save(site);
		return site;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void deleteSite(Long id) {
		siteRepository.delete(id);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Site> findAllSites() {
		return siteRepository.findAll();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Site> findAllSites(Iterable<Long> ids) {
		return siteRepository.findAll();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Site> findAllSites(Member member) {
		return siteRepository.findByMember(member);
	}

}
