package com.spring.nutsandspices.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.nutsandspices.entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {

}
