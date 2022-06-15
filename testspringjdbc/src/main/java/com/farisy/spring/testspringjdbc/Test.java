package com.farisy.spring.testspringjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.protocol.Resultset;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/farisy/spring/testspringjdbc/Config.xml");
		JdbcTemplate jdbctemp = (JdbcTemplate) context.getBean("jdbctemplate");
		String sql = "insert into employee values(?,?,?);";
		int recs = jdbctemp.update(sql, "1", "Salmanul", "Farisy K");
		System.out.println("No: of rows affected: " + recs);
		
		
	}

}
