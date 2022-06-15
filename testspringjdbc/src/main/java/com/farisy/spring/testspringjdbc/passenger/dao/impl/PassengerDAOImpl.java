package com.farisy.spring.testspringjdbc.passenger.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.farisy.spring.testspringjdbc.passenger.dao.PassengerDAO;
import com.farisy.spring.testspringjdbc.passenger.dao.rowmapper.PassengerRowMapper;
import com.farisy.spring.testspringjdbc.passenger.dto.Passenger;

@Component("dao")
public class PassengerDAOImpl implements PassengerDAO {

	@Autowired
	private JdbcTemplate jdbctemp;
	
	public int create(Passenger passenger) {
		String sql="insert into passenger values(?,?,?);";
		int affectedRows = jdbctemp.update(sql, passenger.getId(), passenger.getFirstName(), passenger.getLastName());
		return affectedRows;
	}

	public int update(Passenger passenger) {
		String sql = "update passenger set firstname=?, lastname=? where id=?;";
		int affectedRows = jdbctemp.update(sql, passenger.getFirstName(), passenger.getLastName(), passenger.getId());
		return affectedRows;
	}

	public int delete(Passenger passenger) {
		String sql = "delete from passenger where id=?;";
		int affectedRows =jdbctemp.update(sql, passenger.getId());
		return affectedRows;
	}

	public Passenger read(int id) {
		String sql = "select * from passenger where id=?;";
		PassengerRowMapper rowMapper = new PassengerRowMapper();
		Passenger passenger = jdbctemp.queryForObject(sql, rowMapper, id);
		return passenger;
	}

	public List<Passenger> readAll() {
		String sql = "select * from passenger;";
		PassengerRowMapper rowMapper = new PassengerRowMapper();
		List<Passenger> passengersList = jdbctemp.query(sql, rowMapper);
		return passengersList;
	}

}
