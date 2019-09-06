package com.mindtree.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {
	public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Student s=(Student)session.get(Student.class,1);
		s.setStudentAddress("Bhubaneswar");
		session.save(s);
		tx.commit();
	
}
}
