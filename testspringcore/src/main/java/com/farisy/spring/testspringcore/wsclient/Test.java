package com.farisy.spring.testspringcore.wsclient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/farisy/spring/testspringcore/wsclient/Config.xml");
		WSClient client = (WSClient) context.getBean("wsclient");
		System.out.println(client);
	}

}
