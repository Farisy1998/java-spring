package com.farisy.spring.testspringcoreadvanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/farisy/spring/testspringcoreadvanced/injecting/interfaces/Config.xml");
		OrderBOImpl bo = (OrderBOImpl) context.getBean("boimpl");
		bo.placeOrder();
	}

}
