package com.spring.springorm.passenger.dao;

import java.util.List;

import com.spring.springorm.passenger.entity.Passenger;

public interface PassengerDAO {
	void create(Passenger passenger);

	void update(Passenger passenger);

	void delete(Passenger passenger);

	Passenger find(int id);

	List<Passenger> findAll();
}
