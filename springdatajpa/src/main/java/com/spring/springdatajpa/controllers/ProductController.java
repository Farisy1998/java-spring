package com.spring.springdatajpa.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springdatajpa.entities.Product;
import com.spring.springdatajpa.entities.repository.ProductRepository;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    ProductRepository repository;

    @GetMapping
    public Iterable<Product> getProducts() {
        return repository.findAll();
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return repository.save(product);
    }

    @PutMapping
    public Product update(Product product) {
        return repository.save(product);
    }

    @GetMapping("/{id}")
    public Optional getProducts(@PathVariable("id") Long id) {
        Optional<Product> product = repository.findById(id);
        if (!(product.isPresent())) {
            System.out.println("Product Record not found with id: " + id);
        }
        return product;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        repository.deleteById(id);
        System.out.println("Product record with id: " + id + " deleted successfuly");
    }

}
