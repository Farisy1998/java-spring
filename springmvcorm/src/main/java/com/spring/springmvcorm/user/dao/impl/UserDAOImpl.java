package com.spring.springmvcorm.user.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.springmvcorm.user.dao.UserDAO;
import com.spring.springmvcorm.user.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private HibernateTemplate hibernateTemp;

	public HibernateTemplate getHibernateTemp() {
		return hibernateTemp;
	}

	public void setHibernateTemp(HibernateTemplate hibernateTemp) {
		this.hibernateTemp = hibernateTemp;
	}

	@Override
	public int create(User user) {
		Integer result = (Integer) hibernateTemp.save(user);
		return result;
	}

	@Override
	public List<User> findAll() {
		List<User> usersList = hibernateTemp.loadAll(User.class);
		return usersList;
	}

	@Override
	public User findUser(Integer id) {
		return hibernateTemp.get(User.class, id);
	}

}
