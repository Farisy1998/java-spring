package com.spring.springmvcorm.user.services.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.springmvcorm.user.dao.UserDAO;
import com.spring.springmvcorm.user.entity.User;
import com.spring.springmvcorm.user.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO dao;

	public UserDAO getDao() {
		return dao;
	}

	public void setDao(UserDAO dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public int save(User user) {
		// Buisness Logic here
		return dao.create(user);
	}

	@Override
	public List<User> loadAll() {
		List<User> users = dao.findAll();
		Collections.sort(users);
		return users;
	}

}
