package com.farisy.spring.testspringcoreadvanced.autowiring.hotelmanagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/farisy/spring/testspringcoreadvanced/autowiring/hotelmanagement/Config.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer);
	}

}
