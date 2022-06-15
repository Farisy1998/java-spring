package com.farisy.spring.testspringcoreadvanced.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/farisy/spring/testspringcoreadvanced/stereotype/annotations/Config.xml");
		Instructor instructor = (Instructor) context.getBean("instr");
		System.out.println(instructor);
		
		Instructor instructor2 = (Instructor) context.getBean("instr");
		System.out.println(instructor2);
	}
}
