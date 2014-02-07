package com.matafe.iniciativaverde.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * <p>
 * Represent a Certificate
 * 
 * @author Mauricio Tavares Ferraz
 */
@Entity
@Table
public class Certificate extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "site_id")
	private Site site;

	@Temporal(TemporalType.DATE)
	@Column(name = "valid_date")
	private Calendar validDate;

	@Version
	private Long version;

	public Certificate() {
		super();
	}

	/**
	 * @return the site
	 */
	public Site getSite() {
		return site;
	}

	/**
	 * @param site
	 *            the site to set
	 */
	public void setSite(Site site) {
		this.site = site;
	}

	/**
	 * @return the validDate
	 */
	public Calendar getValidDate() {
		return validDate;
	}

	/**
	 * @param validDate
	 *            the validDate to set
	 */
	public void setValidDate(Calendar validDate) {
		this.validDate = validDate;
	}

	/**
	 * @return the valid
	 */
	public boolean isValid() {
		return Calendar.getInstance().before(validDate);
	}

	/**
	 * @return the version
	 */
	public Long getVersion() {
		return version;
	}

}