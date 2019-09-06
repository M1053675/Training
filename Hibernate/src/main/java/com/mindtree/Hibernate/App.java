package com.mindtree.Hibernate;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Student s=new Student();
		s.setRollNumber(1);
		s.setStudentName("a");
		s.setStudentAddress("Bangalore");
		Student s1=new Student();
		s1.setRollNumber(2);
		s1.setStudentName("b");
		s1.setStudentAddress("Bhubaneswar");
		Student s2=new Student();
		s2.setRollNumber(3);
		s2.setStudentName("c");
		s2.setStudentAddress("chennai");
		Student s3=new Student();
		s3.setRollNumber(4);
		s3.setStudentName("d");
		s3.setStudentAddress("Hyderabad");
		Student s4=new Student();
		s4.setRollNumber(5);
		s4.setStudentName("e");
		s4.setStudentAddress("Delhi");
		session.save(s);
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		tx.commit();
		
    }
}
