package com.tut.HibernateProjectOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity

public class Student {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;   
   private String name;
   private String city;
   private int pin;
   
   private Certificate certi;
   
   
   
   public Student ( int id, String name, String city, int pin) {
	   super();
	   this.id=id;
	   this.name=name;
	   this.city=city;
	   this.pin=pin;
	   
   }

   public Student() {
	   super();
   }
   
public int getId() {
	return id;
}

public void setId(int id){
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public int getpin() {
	return pin;
}

public void setpin(int pin){
	this.pin = pin;
}


public Certificate getCerti() {
	return certi;
}

public void setCerti(Certificate certi) {
	this.certi = certi;
}
@Override
public String toString() {
	  // TODO Auto-generated method stub
	  return this.id+":"+this.name +":"+this.city +":"+this.pin;
  }
	
}
