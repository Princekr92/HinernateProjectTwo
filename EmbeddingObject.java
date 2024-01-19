package com.tut.HibernateProjectOne;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddingObject {
	public static void main(String[] args) {

	
	// Embadding Anotations using table for don't need to create another table  
	Configuration cfg=new Configuration();
	cfg.configure("com/tut/HibernateProjectOne/hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	
	Student student1=new Student();
	int id = Integer.parseInt(JOptionPane.showInputDialog("Enter the Id No "));
	student1.setId(id);
	String name =JOptionPane.showInputDialog("Enter the Name");
	student1.setName(name);
	String city = JOptionPane.showInputDialog("Enter the City ");
	student1.setCity(city);
	int pin = Integer.parseInt(JOptionPane.showInputDialog("Enter the Pin No "));
    student1.setpin(pin);
	
	Certificate certificate=new Certificate();
    String course =JOptionPane.showInputDialog("Enter the Course Name ");
	certificate.setCourse(course);
	String duration = JOptionPane.showInputDialog("Enter the Duration ");
	certificate.setDuration(duration);
	student1.setCerti(certificate);

	session.save(student1);
	//session.save(certificate);
	
	tx.commit();
	factory.close();
	session.close();
   }
}
