package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Dept {
	
	@Id
	private int did;
	private String dname;
	
// In mapping collection framework used mostly like here list
	
    // @OneToMany : 1 Department many Employee
	@OneToMany(mappedBy = "dept") //mappedBy used for not generate 3rd table  

	private List<Emp> emp;   // coz of many Employee we stored it in list
	
	public Dept() {
		
	}

	public Dept(int did, String dname, List<Emp> emp) {
		super();
		this.did = did;
		this.dname = dname;
		this.emp = emp;
	}



	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public List<Emp> getEmp() {
		return emp;
	}

	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}


	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + ", emp=" + emp + "]";
	}
	

}
