package com.ty.Dep_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSmartPhone {
	public static void main(String[] args) {
		
	
	ApplicationContext context = new ClassPathXmlApplicationContext("SmartPhone.xml");
	SmartPhone sp = (SmartPhone) context.getBean("mySmartPhone");
	System.out.println("Name is: "+sp.getName());
	System.out.println("Ram is: "+sp.getRam());
	System.out.println("Service is: "+sp.getS().getService());
	System.out.println("Number is: "+sp.getS().getNumber());
	
	
	}
}
