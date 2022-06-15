package com.farisy.spring.testspringcoreadvanced.autowiring.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/farisy/spring/testspringcoreadvanced/autowiring/qualifier/Config.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
	}

}
