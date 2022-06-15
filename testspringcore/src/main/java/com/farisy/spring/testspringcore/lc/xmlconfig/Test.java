package com.farisy.spring.testspringcore.lc.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/farisy/spring/testspringcore/lc/xmlconfig/Config.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient.getId());
		context.registerShutdownHook();
	}
}
