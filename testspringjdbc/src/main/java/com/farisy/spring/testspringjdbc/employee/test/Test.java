package com.farisy.spring.testspringjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.farisy.spring.testspringjdbc.employee.dao.EmployeeDAO;
import com.farisy.spring.testspringjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/farisy/spring/testspringjdbc/employee/test/Config.xml");
		EmployeeDAO empdao = (EmployeeDAO) context.getBean("empdao");
		Employee emp= new Employee();
		List<Employee> emplist = empdao.readAll();
		for (Employee employee : emplist) {
			System.out.println(employee);
		}
	}
}
