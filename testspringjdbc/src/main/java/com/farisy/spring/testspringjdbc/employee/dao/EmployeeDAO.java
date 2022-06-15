package com.farisy.spring.testspringjdbc.employee.dao;

import java.util.List;

import com.farisy.spring.testspringjdbc.employee.dto.Employee;

public interface EmployeeDAO {
	int create(Employee emp);
	int update(Employee emp);
	int delete(Employee emp);
	Employee read(int id);
	List<Employee> readAll();
}
