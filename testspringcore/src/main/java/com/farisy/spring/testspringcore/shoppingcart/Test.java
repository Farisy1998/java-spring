package com.farisy.spring.testspringcore.shoppingcart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/farisy/spring/testspringcore/shoppingcart/config.xml");
		ShoppingCart cart = (ShoppingCart) context.getBean("shoppingcart");
		Item item = cart.getItem();
		System.out.println("ID: "+item.getId()+", Name: "+item.getName()+", Price: "+item.getPrice()+", Quantity: "+item.getQuantity());
	}

}
