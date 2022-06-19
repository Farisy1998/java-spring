package com.spring.springaop.test;

import javax.naming.Context;
import javax.swing.text.AbstractDocument.Content;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springaop.ProductService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springaop/test/Config.xml");
		ProductService productService = (ProductService) context.getBean("productService");
		int result = productService.multiply(5, 3);
		System.out.println(result);
	}

}
