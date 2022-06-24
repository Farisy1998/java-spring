package com.spring.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.springboot.dao.DAO;

@Component
public class Service {

	DAO dao;

	@Autowired
	Service(DAO dao) {
		System.out.println("Service bean created");
		this.dao = dao;
	}

	public void save() {
		dao.create();
	}
}
