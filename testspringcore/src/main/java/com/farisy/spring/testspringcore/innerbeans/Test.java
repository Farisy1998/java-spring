package com.farisy.spring.testspringcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/farisy/spring/testspringcore/innerbeans/Config.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp.hashCode());
		
		Employee emp2 = (Employee) context.getBean("emp");
		System.out.println(emp2.hashCode());
	}

}
