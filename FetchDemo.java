package com.tut.HibernateProjectOne;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class FetchDemo {
  
	public static void main(String[]args) {
		
		// get , load
		Configuration cfg=new Configuration();
		cfg.configure("com/tut/HibernateProjectOne/hibernate.update.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Id which you want to "));
		// anyone used method get, find, load
		Student student=session.load(Student.class,id);
		System.out.println(student);
		
		
	
		session.close();
		factory.close();
		
	}
}
