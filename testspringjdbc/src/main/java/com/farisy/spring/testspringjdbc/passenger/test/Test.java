package com.farisy.spring.testspringjdbc.passenger.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.farisy.spring.testspringjdbc.passenger.dao.PassengerDAO;
import com.farisy.spring.testspringjdbc.passenger.dto.Passenger;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/farisy/spring/testspringjdbc/passenger/test/Config.xml");
		PassengerDAO dao = (PassengerDAO) context.getBean("dao");
		Passenger passenger = new Passenger();
		System.out.println("Passengers Records: ");
		for(Passenger pass : dao.readAll()) {
			System.out.println(pass);
		}
	}

}
