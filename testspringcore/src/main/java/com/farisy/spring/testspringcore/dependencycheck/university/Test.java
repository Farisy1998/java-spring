package com.farisy.spring.testspringcore.dependencycheck.university;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/farisy/spring/testspringcore/dependencycheck/university/Config.xml");
		University university = (University) context.getBean("university");
		System.out.println(university);
	}

}
