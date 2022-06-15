package com.farisy.spring.testspringjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.farisy.spring.testspringjdbc.employee.dao.EmployeeDAO;
import com.farisy.spring.testspringjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.farisy.spring.testspringjdbc.employee.dto.Employee;

@Component("empdao")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbctemp;

	@Override
	public int create(Employee emp) {
		String sql = "insert into employee values(?,?,?);";
		int recs = jdbctemp.update(sql, emp.getId(), emp.getFirstName(), emp.getLastName());
		return recs;
	}

	@Override
	public int update(Employee emp) {
		String sql = "update employee set firstname=?, lastname=? where id=?;";
		int res = jdbctemp.update(sql, emp.getFirstName(), emp.getLastName(), emp.getId());
		return res;
	}

	@Override
	public int delete(Employee emp) {
		String sql = "delete from employee where id=?;";
		int res = jdbctemp.update(sql, emp.getId());
		return res;
	}

	@Override
	public Employee read(int id) {
		String sql = "select * from employee where id = ?;";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		Employee emp = jdbctemp.queryForObject(sql, rowMapper, id);	//For retriving one single row 
		return emp;
	}

	public List<Employee> readAll() {
		String sql = "select * from employee";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		List<Employee> emplist = jdbctemp.query(sql, rowmapper);	//For retriving mulitple rows
		return emplist;
	}

	public JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}

	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}

}
