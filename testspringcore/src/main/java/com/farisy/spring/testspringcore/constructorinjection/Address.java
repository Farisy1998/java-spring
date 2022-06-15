package com.farisy.spring.testspringcore.constructorinjection;

public class Address {
	private int hno;
	private String street;
	private String city;

	public Address(int hno, String street, String city) {
		this.hno = hno;
		this.street = street;
		this.city = city;
	}
	
	public int getHno() {
		return hno;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", street=" + street + ", city=" + city + "]";
	}

}
