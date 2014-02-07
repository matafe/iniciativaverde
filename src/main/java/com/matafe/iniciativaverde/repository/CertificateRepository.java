package com.matafe.iniciativaverde.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matafe.iniciativaverde.domain.Certificate;
import com.matafe.iniciativaverde.domain.Site;

/**
 * <p>
 * Certificate Repository
 * 
 * @author Mauricio Tavares Ferraz
 */
@Repository
public interface CertificateRepository extends JpaRepository<Certificate, Long> {

	List<Certificate> findBySite(Site site);

}
