package com.matafe.iniciativaverde.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * <p>
 * Represent a Member
 * 
 * @author Mauricio Tavares Ferraz
 */
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Member extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@NotNull
	@Size(min = 1, max = 25)
	@Column(nullable = false, length = 255)
	private String name;

	@NotNull
	@NotEmpty
	@Email
	@Column(nullable = false, length = 255, unique = true)
	private String email;

	@Column(nullable = false, length = 1, columnDefinition = "boolean default true")
	private boolean active = true;

	@Version
	private Long version;

	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "owner", orphanRemoval = true)
	private List<Site> sites = new ArrayList<Site>(1);

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the sites
	 */
	public List<Site> getSites() {
		return sites;
	}

	/**
	 * @param sites
	 *            the sites to set
	 */
	public void setSites(List<Site> sites) {
		this.sites = sites;
	}

	/**
	 * @param site
	 *            the site to add
	 */
	public void addSite(Site site) {
		site.setOwner(this);
		this.sites.add(site);
	}

	/**
	 * @return the version
	 */
	public Long getVersion() {
		return version;
	}

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active
	 *            the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Member [email=").append(email).append(", id=")
				.append(id).append("]");
		return builder.toString();
	}

}