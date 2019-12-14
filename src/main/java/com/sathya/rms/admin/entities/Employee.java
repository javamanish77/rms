package com.sathya.rms.admin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String eid;
	private String ename;
	private Double salary;
	private Integer phno;
	private String desigid;
	private String rid;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getPhno() {
		return phno;
	}
	public void setPhno(Integer phno) {
		this.phno = phno;
	}
	public String getDesigid() {
		return desigid;
	}
	public void setDesigid(String desigid) {
		this.desigid = desigid;
	}
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", phno=" + phno
				+ ", desigid=" + desigid + ", rid=" + rid + "]";
	}
	
}
