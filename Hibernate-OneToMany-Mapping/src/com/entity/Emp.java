package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Emp {

	@Id
	private int eid;
	private String ename;
	
	
	@ManyToOne          // many employee 1 Department
//	@JoinColumn(name = "emp_dept_id")  //set column name which will be created in table if we not give this annotation it will automatically created name

	private Dept dept;  //Class name reference created with temporary name
                         // like this we achieved loose coupling


	public Emp() {
			}


	public Emp(int eid, String ename, Dept dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public Dept getDept() {
		return dept;
	}


	public void setDept(Dept dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", dept=" + dept + "]";
	}
	
	
	}
	

