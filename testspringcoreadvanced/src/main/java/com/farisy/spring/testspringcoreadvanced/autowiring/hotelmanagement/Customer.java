package com.farisy.spring.testspringcoreadvanced.autowiring.hotelmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
	private String name;
	
	@Autowired
	private Reservation reservation;
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", reservation=" + reservation + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Reservation getReservation() {
		return reservation;
	}

}
