package com.spring.springorm.passenger.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springorm.passenger.dao.PassengerDAO;
import com.spring.springorm.passenger.entity.Passenger;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/springorm/passenger/test/Config.xml");
		PassengerDAO dao = (PassengerDAO) context.getBean("passengerdao");
		Passenger passenger = new Passenger();
		List<Passenger> passengersList = dao.findAll();
		System.out.println("Passenger Record: ");
		for(Passenger pass : passengersList) {
			System.out.println(pass);
		}
	}

}
