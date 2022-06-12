package com.ty;

//IOC CONTAINER- 
//	2.J2EE Container


//Dependecny Injection there are 2 types:using xml only
//1. setter intialization using xml

//2 Constructor intialization using xml
public class Person {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
