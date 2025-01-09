package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Student;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class StudentDao {

	public void Inserdata() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class); // Add annotated class

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = new Student();

		s.setFname("pooja");
		s.setLname("bhale");
		s.setAge(25);
		s.setMarks(77.4f);

		ss.persist(s); // save or insert obj data
		System.out.println(s);

		ss.close(); // close connection with DB

		System.out.println("application is started ");

	}

	public void FetchData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		CriteriaBuilder hcb = ss.getCriteriaBuilder();
		CriteriaQuery<Object> cq = hcb.createQuery();
		Root<Student> root = cq.from(Student.class);
		cq.select(root);

		Query query = ss.createQuery(cq);
		List<Student> list = query.getResultList();

		for (Student students : list) {
			System.out.println(students);
		}
	}

	public void DeleteData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class); // Add annotated class

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 3;
		Student s1 = ss.get(Student.class, id); // get used for fetch particular data from DB, using Class name,
												// entity(var name)

		System.out.println(s1); // to get particular record

		ss.remove(s1); // delete obj data
		tr.commit(); // to make changes permanently
		ss.close(); // close connection with DB
		System.out.println("Data is deleted sucessfully");
	}
	
	public void UpdateData() {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class); // Add annotated class

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 1;
		Student s = ss.get(Student.class, id); // get used for fetch particular data from DB, using Class name, entity(var name)
	
		s.setAge(23);
		s.setMarks(86.90f);
	
		ss.merge(s);   // combination of two things & its scope within session(Interface) only 
	//	ss.update(s);  // replace field(Variables) & its scope out of session(Interface) too 
 
		System.out.println("Data Updated Sucessfully"); // to fetch particular record

		tr.commit(); // to make changes permanently
		ss.close(); // close connection with DB
		
	}

}
