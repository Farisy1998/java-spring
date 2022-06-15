package com.farisy.spring.testspringcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/farisy/spring/testspringcore/standalone/collections/Config.xml");
		Products products = (Products) context.getBean("productsList");
		System.out.println(products.getProductNames());
		
	}

}
