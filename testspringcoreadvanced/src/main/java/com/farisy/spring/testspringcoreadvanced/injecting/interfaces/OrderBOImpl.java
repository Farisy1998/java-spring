package com.farisy.spring.testspringcoreadvanced.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("boimpl")
public class OrderBOImpl implements OrderBO {

	@Autowired
	@Qualifier("dao2")
	private OrderDAO dao;

	@Override
	public void placeOrder() {
		// TODO Auto-generated method stub
		System.out.println("Inside placeOrder()");
		dao.createOrder();
	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
