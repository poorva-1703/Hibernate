package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // use for auto_increment
	private int id;

	private String Fname; // fields(Variables)
	private String Lname;
	private int Age;      // fields are private bcz data is coming from frontend
	
//	@Column(name = "Percentage")  // rename column marks to Percentage
	private float marks;

	public Student() {

	}

	public Student(int id, String fname, String lname, int age, float marks) {
		super();
		this.id = id;
		Fname = fname;
		Lname = lname;
		Age = age;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + ", age=" + Age + ", marks=" + marks
				+ "]";
	}

	
}
