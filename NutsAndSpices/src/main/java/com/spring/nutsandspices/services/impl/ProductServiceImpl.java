package com.spring.nutsandspices.services.impl;

import java.util.List;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.nutsandspices.entities.Product;
import com.spring.nutsandspices.repository.ProductRepository;
import com.spring.nutsandspices.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepos;

	public Iterable<Product> fetchAllProducts() {
		return productRepos.findAll();
	}
	
	
}
