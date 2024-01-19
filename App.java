package com.tut.HibernateProjectOne;
 
import java.io.FileInputStream;
import java.util.Date;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import java.io.FileInputStream;

public class App {

	public static void main(String[] args)throws Exception {
		
		System.out.println("Project started...");
		// build classpath
		Configuration cfg=new Configuration();
		cfg.configure("com/tut/HibernateProjectOne/hibernate.cfg.xml");
		// mapping file load in memory and check the formate
	    SessionFactory factory=cfg.buildSessionFactory();
	    
	    
	    //creating student
	    int id=Integer.parseInt(JOptionPane.showInputDialog("write the ID"));
	    String name = JOptionPane.showInputDialog("Enter name");
	    String city = JOptionPane.showInputDialog("Enter City");
	    int pin =Integer.parseInt(JOptionPane.showInputDialog("Enter Pin"));
	    
	    Student st=new Student();
	    st.setId(id);
	    st.setName(name);
	    st.setCity(city);
	    st.setpin(pin);
	    System.out.println(st);
	    
	    
	    
	    // creating object of address class
	    Address ad=new Address();
	    ad.setStreet("street1");
	    ad.setCity("Chandigarh");
	    ad.setOpen(true);
	    ad.setAddedDate(new Date());
	    ad.setX(1239.23);
	    
	    // Reading image
	    FileInputStream fis=new FileInputStream("src/main/java/com/tut/HibernateProjectOne/xyz.png");
	    System.out.println("image");
	    byte [] data=new byte[fis.available()];
	    fis.read(data);
	    ad.setImage(data);
	    
	    
		//System.out.println(factory.isClosed());
	    Session session=factory.openSession();
	    
	    // transaction used to rollback or commit
		Transaction tx=session.beginTransaction();
		
		// give the instruction of hibernate for save data
		session.save(st);
		session.save(ad);
		tx.commit();
		session.close();
		System.out.println("Done...");
	
	}
}
