package com.sathya.rms.admin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String ctyId;
	private String ctyName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCtyId() {
		return ctyId;
	}

	public void setCtyId(String ctyId) {
		this.ctyId = ctyId;
	}

	public String getCtyName() {
		return ctyName;
	}

	public void setCtyName(String ctyName) {
		this.ctyName = ctyName;
	}

}
