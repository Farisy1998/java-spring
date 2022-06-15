package com.farisy.spring.testspringcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/farisy/spring/testspringcore/dependencycheck/Config.xml");
		Prescription prescription = (Prescription) context.getBean("prescription");
		System.out.println(prescription);
	}
}
