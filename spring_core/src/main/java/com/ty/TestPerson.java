package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//1. setter intialization using xml
public class TestPerson {
	public static void main(String[] args) {
		
		//Person p = new Person;
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Person p =(Person) context.getBean("myPerson");
		System.out.println(p);
		System.out.println("Id is: "+p.getId());
		System.out.println("Name is: "+p.getName());
	}

}
