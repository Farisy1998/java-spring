package com.spring.springorm.passenger.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.springorm.passenger.dao.PassengerDAO;
import com.spring.springorm.passenger.entity.Passenger;

@Component("passengerdao")
public class PassengerDAOImpl implements PassengerDAO {

	@Autowired
	HibernateTemplate hibernateTemp;
	
	@Override
	@Transactional
	public void create(Passenger passenger) {
		hibernateTemp.save(passenger);
	}

	@Override
	@Transactional
	public void update(Passenger passenger) {
		hibernateTemp.update(passenger);
	}

	@Override
	@Transactional
	public void delete(Passenger passenger) {
		hibernateTemp.delete(passenger);
	}

	@Override
	public Passenger find(int id) {
		Passenger passenger = hibernateTemp.get(Passenger.class, id);
		return passenger;
	}

	@Override
	public List<Passenger> findAll() {
		List<Passenger> passengersList = hibernateTemp.loadAll(Passenger.class);
		return passengersList;
	}

}
