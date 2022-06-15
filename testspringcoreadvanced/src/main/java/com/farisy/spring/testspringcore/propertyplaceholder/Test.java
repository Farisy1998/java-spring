package com.farisy.spring.testspringcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/farisy/spring/testspringcore/propertyplaceholder/Config.xml");
		MyDAO mydao = (MyDAO) context.getBean("mydao");
		System.out.println(mydao);
	}
}
