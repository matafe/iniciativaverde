package com.matafe.iniciativaverde.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
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
	@Column(name="page_views", nullable = false)
	private Long pageViews = 0L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "OWNER_ID")
	private Member owner;

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Site [url=").append(url).append("]");
		return builder.toString();
	}

}