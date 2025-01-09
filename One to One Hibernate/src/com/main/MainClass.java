package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Laptop;
import com.entities.Stud;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Stud.class);
		cfg.addAnnotatedClass(Laptop.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		// System.out.println("entities maps sucessfully");

		Laptop l = new Laptop();
		l.setLid(103);
		l.setLname("Dell");
//		ss.persist(l);  

		Stud s = new Stud();
		s.setSid(12);
		s.setSname("rucha");
		s.setLaptop(l); // pass ref obj of laptop

//		ss.persist(s);  
//		
//		System.out.println("data is inserted");
//			
//		tr.commit();
//		ss.close();

		
		
		
		                                                     // get method

//	int sid = 11;
//	Stud s1 = ss.get(Stud.class, sid);
//	System.out.println(s1);
//	
//	ss.close();

//		int sid = 2;
//		Stud s1 = ss.get(Stud.class, sid);   // gives null msg if not present in DB
//		System.out.println(s1);
//
//		ss.close();

		
		                                          // load method : Deprecated now

//		int lid = 103;
//		Laptop l1 = ss.load(Laptop.class, lid);
//		System.out.println(l1);
//	
//		ss.close();

		int lid = 110;
		Laptop l1 = ss.load(Laptop.class, lid);  // gives exception if not present in DB
		System.out.println(l1);
	
		ss.close();		
	}

}
