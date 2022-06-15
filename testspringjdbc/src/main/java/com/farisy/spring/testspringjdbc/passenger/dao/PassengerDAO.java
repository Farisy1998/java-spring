package com.farisy.spring.testspringjdbc.passenger.dao;

import java.util.List;

import com.farisy.spring.testspringjdbc.passenger.dto.Passenger;

public interface PassengerDAO {
	int create(Passenger passenger);
	int update(Passenger passenger);
	int delete(Passenger passenger);
	Passenger read(int id);
	List<Passenger> readAll();
}
