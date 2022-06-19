package com.spring.springmvcorm.user.dao;

import java.util.List;

import com.spring.springmvcorm.user.entity.User;

public interface UserDAO {
	int create(User user);

	List<User> findAll();
	
	User findUser(Integer id);
}
