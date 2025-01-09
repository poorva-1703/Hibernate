package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Stud {

	@Id
	private int sid;
	private String sname;
	
	@OneToOne
	private Laptop laptop; //Class name reference created with temporary name
	                        // like this we achieved loose coupling

	public Stud() {
	}
	
	
	public Stud(int sid, String sname, Laptop laptop) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.laptop = laptop;
	}


	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}


	@Override
	public String toString() {
		return "Stud [sid=" + sid + ", sname=" + sname + ", laptop=" + laptop + "]";
	}
	
	
	
}
