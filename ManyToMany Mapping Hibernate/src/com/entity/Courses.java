package com.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Courses {

	@Id
	private int cid;
	
   	private String cname;

   	@ManyToMany //(mappedBy = "course")
	private List<Studs> stud; // coz one course list of many students

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Studs> getStud() {
		return stud;
	}

	public void setStud(List<Studs> stud) {
		this.stud = stud;
	}

	public Courses(int cid, String cname, List<Studs> stud) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.stud = stud;
	}

	public Courses() {
			}

	@Override
	public String toString() {
		return "Courses [cid=" + cid + ", cname=" + cname + ", stud=" + stud + "]";
	}

	
}
