package com.farisy.spring.testspringcore.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/farisy/spring/testspringcore/constructorinjection/ambiguity/Config.xml");
		Addition addition = (Addition) context.getBean("addition");
		System.out.println(addition);
	}

}
