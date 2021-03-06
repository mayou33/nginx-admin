package com.jslsolucoes.nginx.admin.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "resource_identifier")
@SequenceGenerator(name = "resource_identifier_sq", initialValue = 1, allocationSize = 1, sequenceName = "resource_identifier_sq")
public class ResourceIdentifier implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "resource_identifier_sq")
	private Long id;

	@Column(name = "uuid")
	private String uuid;

	public ResourceIdentifier() {

	}

	public ResourceIdentifier(String uuid) {
		this.uuid = uuid;
	}

	public ResourceIdentifier(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
