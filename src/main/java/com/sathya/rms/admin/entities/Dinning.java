package com.sathya.rms.admin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dinning {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String did;
	private Integer capacity;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Dinning [id=" + id + ", did=" + did + ", capacity=" + capacity + "]";
	}

}
