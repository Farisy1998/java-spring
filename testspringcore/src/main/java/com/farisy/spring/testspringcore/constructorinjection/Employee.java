package com.farisy.spring.testspringcore.constructorinjection;

public class Employee {
	private int id;
	private Address address;

	public Employee(int id, Address address) {
		this.id = id;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}

	public int getId() {
		return id;
	}

	public Address getAddress() {
		return address;
	}
	
}
