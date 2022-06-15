package com.farisy.spring.testspringcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/farisy/spring/testspringcore/map/Config.xml");
		Customer customer = (Customer) context.getBean("Customer");
		System.out.println("Customer ID: "+customer.getId());
		System.out.println("Products: "+customer.getProducts());
	}

}
