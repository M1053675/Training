package com.mindtree.Hibernate;

import java.util.Iterator;


import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Display {
	public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		String query="from Student";
		Query q=session.createQuery(query);
		List list=q.list();
		Iterator i=list.iterator();
		while(i.hasNext()) {
		Student s=(Student)i.next();
		System.out.println(s.getRollNumber());
		System.out.println(s.getStudentName());
		System.out.println(s.getStudentAddress());
		}
		tx.commit();
    }
}
