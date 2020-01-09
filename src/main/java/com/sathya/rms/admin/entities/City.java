package com.sathya.rms.admin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String ctyId;
	private String ctyName;
	
	@ManyToOne
	@JoinColumn(name="st_id")
	private State state;

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

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
