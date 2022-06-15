package com.farisy.spring.testspringcoreadvanced.autowiring.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private Address address;
	
	@Autowired
	Employee(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
