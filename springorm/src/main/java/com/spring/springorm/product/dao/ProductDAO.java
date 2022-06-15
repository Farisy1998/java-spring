package com.spring.springorm.product.dao;

import java.util.List;

import com.spring.springorm.product.entity.Product;

public interface ProductDAO {
	void create(Product product);
	void update(Product product);
	void delete(Product product);
	Product find(int id);
	List<Product> findAll();
}
