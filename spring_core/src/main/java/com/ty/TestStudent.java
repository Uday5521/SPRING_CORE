package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//2 Constructor intialization using xml
public class TestStudent {
	public static void main(String[] args) {
		
		//Student s = new Student();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Student s = (Student) context.getBean("myStudent");
		System.out.println(s);
		System.out.println("Name is : "+s.getName());
		System.out.println("Register number is: "+s.getReg_no());
	}

}
