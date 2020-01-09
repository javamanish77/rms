package com.sathya.rms.admin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Designation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String desigid;
	private String designame;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDesigid() {
		return desigid;
	}
	public void setDesigid(String desigid) {
		this.desigid = desigid;
	}
	public String getDesigname() {
		return designame;
	}
	public void setDesigname(String designame) {
		this.designame = designame;
	}
	@Override
	public String toString() {
		return "Designation [id=" + id + ", desigid=" + desigid + ", designame=" + designame + "]";
	}
	
	
}
