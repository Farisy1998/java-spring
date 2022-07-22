package com.spring.nutsandspices.services;

import java.util.List;

import com.spring.nutsandspices.entities.Product;

public interface ProductService {

		Iterable<Product> fetchAllProducts();
}
