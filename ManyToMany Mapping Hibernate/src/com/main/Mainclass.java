package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Courses;
import com.entity.Studs;


public class Mainclass {

	public static void main(String[] args) {

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Courses.class);
	cfg.addAnnotatedClass(Studs.class);

	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();	
	
	Studs s1 = new Studs();
	s1.setSid(1);
	s1.setSname("soham");
	
	Studs s2 = new Studs();
	s2.setSid(2);
	s2.setSname("manoj");

	Studs s3 = new Studs();
	s3.setSid(3);
	s3.setSname("raj");
	
	Courses c1 = new Courses();
	c1.setCid(105);
	c1.setCname("core java");
	
	Courses c2 = new Courses();
	c2.setCid(106);
	c2.setCname("advance java");
	
	
	List<Studs> slist = new ArrayList<Studs>();
	List<Courses> clist = new ArrayList<Courses>();
	
	slist.add(s1);
	slist.add(s2);
	slist.add(s3);
	
	clist.add(c1);
	clist.add(c2);

	c1.setStud(slist); // c1 courses have 3 students
	c2.setStud(slist); // c2 courses have 3 students

	s1.setCourse(clist); //s1 student have 3 courses
  
	
	ss.persist(s1);
	ss.persist(s2);
	
	ss.persist(c1);
	ss.persist(c2);
	ss.persist(s3);

	tr.commit();
	ss.close();
	
	}

}
