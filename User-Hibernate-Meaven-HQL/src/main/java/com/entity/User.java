package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {                             // Using HQL

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String fname;
	private String lname;
	private int age;
	private char gender;
	private long mb_num;
	private String city;

	public User() {

	}

	public User(int id, String fname, String lanme, int age, char gender, long mb_num, String city) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lanme;
		this.age = age;
		this.gender = gender;
		this.mb_num = mb_num;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLanme() {
		return lname;
	}

	public void setLanme(String lanme) {
		this.lname = lanme;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public long getMb_num() {
		return mb_num;
	}

	public void setMb_num(long mb_num) {
		this.mb_num = mb_num;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lanme=" + lname + ", age=" + age + ", gender=" + gender
				+ ", mb_num=" + mb_num + ", city=" + city + "]";
	}

}
