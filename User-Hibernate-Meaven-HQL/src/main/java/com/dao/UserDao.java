package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.User;

public class UserDao {

	public void InsertData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(User.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession(); // import org.hibernate.Session;
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "insert into User(fname,lname,age,gender,mb_num,city)values(:fname,:last,:ag,:g,:mb,:city)";
		MutationQuery query = ss.createMutationQuery(hqlQuery); // MutationQuery is without generic & .class
		query.setParameter("fname", "neha");
		query.setParameter("last", "kale");
		query.setParameter("ag", 28);
		query.setParameter("g", 'f');
		query.setParameter("mb", 9034621298l);
		query.setParameter("city", "nashika");
	
		query.executeUpdate();
		
		tr.commit();
		ss.close();
		System.out.println("Data is Inserted");

	}

	public void FetchaData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(User.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "from User";
		Query<User> query = ss.createQuery(hqlquery, User.class);
		List<User> li = query.list();

		for (User u : li) {
			System.out.println(u);
		}
	}
		public void UpdataData() {
			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(User.class);

			SessionFactory sf = cfg.buildSessionFactory();
			Session ss = sf.openSession();
			Transaction tr = ss.beginTransaction();
			
			String hqlquery = "update User set  age=:ag, mb_num=:mb where id=:id"; 
			MutationQuery query = ss.createMutationQuery(hqlquery);
			query.setParameter("ag", 30);
			query.setParameter("mb", 8555438902l);
			query.setParameter("id", 1);
			
			query.executeUpdate();
				
			tr.commit();
			ss.close();
			System.out.println("Data is Updated");
		
	}
		
		public void DeleteData() {

			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(User.class);

			SessionFactory sf = cfg.buildSessionFactory();
			Session ss = sf.openSession();
			Transaction tr = ss.beginTransaction();
			
			String hqlquery = "delete from User where id=:uid ";
			MutationQuery query = ss.createMutationQuery(hqlquery);
			query.setParameter("uid", 3);
			
			query.executeUpdate();
		
			tr.commit();
			ss.close();
			System.out.println("Data is Deleted");
			
		
		
		
}}