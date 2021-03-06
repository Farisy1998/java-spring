package com.spring.springorm.product.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.springorm.product.dao.ProductDAO;
import com.spring.springorm.product.entity.Product;

@Component("productdao")
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	HibernateTemplate hibernateTemp;

	@Override
	@Transactional
	public void create(Product product) {
		hibernateTemp.save(product);
	}

	@Override
	@Transactional
	public void update(Product product) {
		hibernateTemp.update(product);
	}

	@Override
	@Transactional
	public void delete(Product product) {
		hibernateTemp.delete(product);
	}

	@Override
	@Transactional
	public Product find(int id) {
		Product product = hibernateTemp.get(Product.class, id);
		return product;
	}

	@Override
	public List<Product> findAll() {
		List<Product> productList = hibernateTemp.loadAll(Product.class);
		return productList;
	}

}
