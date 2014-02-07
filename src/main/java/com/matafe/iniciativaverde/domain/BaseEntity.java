package com.matafe.iniciativaverde.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Simple JavaBean domain object with an id property. Used as a base class for
 * objects needing this property.
 * 
 * @author Mauricio Tavares Ferraz
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable,
		Comparable<BaseEntity> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	protected Long id;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public boolean isNew() {
		return (this.id == null);
	}

	@Override
	public int compareTo(BaseEntity o) {
		return getId().compareTo(o.getId());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getSimpleName() + " [id=").append(id)
				.append("]");
		return builder.toString();
	}

}