package com.ty.Dep_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("CarEngine.xml");
		Car car = (Car) context.getBean("myCar");
		car.e.display();
	
		
	}
}
