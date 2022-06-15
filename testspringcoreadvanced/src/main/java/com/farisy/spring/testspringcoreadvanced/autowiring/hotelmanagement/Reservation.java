package com.farisy.spring.testspringcoreadvanced.autowiring.hotelmanagement;

public class Reservation {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", name=" + name + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
