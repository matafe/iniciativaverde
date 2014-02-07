package com.matafe.iniciativaverde.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * <p>
 * Represent a Site
 * 
 * @author Mauricio Tavares Ferraz
 */
@NamedQuery(name = "Site.findByMember", query = "SELECT s FROM Site s WHERE s.owner = :memberId")
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "url"))
public class Site extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@NotNull
	@NotEmpty
	@Size(min = 1, max = 500)
	private String url;

	@NotNull
	@Column(name = "page_views", nullable = false)
	private Long pageViews = 0L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "owner_id")
	private Member owner;

	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "site", orphanRemoval = true)
	private List<Certificate> certificates = new ArrayList<Certificate>(1);

	@Version
	private Long version;

	public Site() {
		super();
	}

	public Site(String url, Long pageViews, Member owner) {
		super();
		this.url = url;
		this.pageViews = pageViews;
		this.owner = owner;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the pageViews
	 */
	public Long getPageViews() {
		return pageViews;
	}

	/**
	 * @param pageViews
	 *            the pageViews to set
	 */
	public void setPageViews(Long pageViews) {
		this.pageViews = pageViews;
	}

	/**
	 * @return the owner
	 */
	public Member getOwner() {
		return owner;
	}

	/**
	 * @param owner
	 *            the owner to set
	 */
	public void setOwner(Member owner) {
		this.owner = owner;
	}

	/**
	 * @return the version
	 */
	public Long getVersion() {
		return version;
	}

	/**
	 * @param certificate
	 *            the certificate to add
	 */
	public void addSite(Certificate certificate) {
		certificate.setSite(this);
		this.certificates.add(certificate);
	}

	/**
	 * @return the certificates
	 */
	public List<Certificate> getCertificates() {
		return certificates;
	}

	/**
	 * @return the last certificate
	 */
	public Certificate getLastCertificate() {
		List<Certificate> list = getCertificates();
		Collections.sort(list, new Comparator<Certificate>() {
			@Override
			public int compare(Certificate o1, Certificate o2) {
				long t1 = o1.getValidDate().getTimeInMillis();
				long t2 = o2.getValidDate().getTimeInMillis();
				if (t2 > t1) {
					return 1;
				} else if (t1 > t2) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		Certificate last = null;

		if (!list.isEmpty()) {
			last = list.iterator().next();
		}

		return last;
	}

	/**
	 * @return the last valid certificate
	 */
	public Certificate getLastValidCertificate() {
		List<Certificate> list = getCertificates();
		Collections.sort(list, new Comparator<Certificate>() {
			@Override
			public int compare(Certificate o1, Certificate o2) {
				long t1 = o1.getValidDate().getTimeInMillis();
				long t2 = o2.getValidDate().getTimeInMillis();
				if (t2 > t1) {
					return 1;
				} else if (t1 > t2) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		Certificate lastValid = null;
		for (Certificate cert : list) {
			if (cert.isValid()) {
				lastValid = cert;
				break;
			}
		}
		return lastValid;
	}

	/**
	 * @param certificates
	 *            the certificates to set
	 */
	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Site [url=").append(url).append("]");
		return builder.toString();
	}

}