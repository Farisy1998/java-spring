package com.farisy.spring.testspringcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/farisy/spring/testspringcore/set/config.xml");
		CarDealer cd = (CarDealer) context.getBean("CarDealer");
		System.out.println("Car dealeer location: "+cd.getName());
		System.out.println("Car models: "+ cd.getModels());
	}

}
