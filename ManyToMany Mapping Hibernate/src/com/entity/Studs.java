package com.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Studs {

	@Id
	private int sid;

	
	@Column(name="Student_Name")
	private String sname;
	
	@ManyToMany(mappedBy = "stud")
	private List<Courses> course; //coz one student list of many courses

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

	public List<Courses> getCourse() {
		return course;
	}

	public void setCourse(List<Courses> course) {
		this.course = course;
	}

	public Studs(int sid, String sname, List<Courses> course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.course = course;
	}

	public Studs() {
		
	}

	@Override
	public String toString() {
		return "Studs [sid=" + sid + ", sname=" + sname + ", course=" + course + "]";
	}


}
