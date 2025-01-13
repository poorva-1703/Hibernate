package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Dept;
import com.entity.Emp;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Dept.class);
		cfg.addAnnotatedClass(Emp.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

	System.out.println("entities map sucessfully "); 
	// table created
		
		Emp e1 = new Emp();
		e1.setEid(21);
		e1.setEname("raj");
	//	
		ss.persist(e1);

		Emp e2 = new Emp();
		e2.setEid(22);
		e2.setEname("ram");
		
		ss.persist(e2);

//		Emp e3 = new Emp();
//		e3.setEid(23);
//		e3.setEname("rakesh");
//		e3.setDept(d);
//		ss.persist(e3);

		List<Emp> list = new ArrayList<Emp>(); // import java.util.List;
		list.add(e1);
		list.add(e2);
//		list.add(e3);

//		ss.persist(list);
		
		Dept d = new Dept();
		d.setDid(102);
		d.setDname(" Cloud ");
		
		e1.setDept(d);
		e2.setDept(d);

		d.setEmp(list);  //coz in dept list exist to set list of emp
		
		ss.persist(d);

		tr.commit();
		ss.close();

	}

}
