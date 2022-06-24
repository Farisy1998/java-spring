package com.spring.springdatajpa;

import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.spring.springdatajpa.entities.Product;
import com.spring.springdatajpa.entities.repository.ProductRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	void saveProducts() {
		ProductRepository repository = context.getBean(ProductRepository.class);
		// Product product = new Product();
		// product.setId(5L);
		// product.setName("iphone SE 2022");
		// product.setDescription("Brand new");
		// product.setPrice(42000D);
		// repository.save(product);
		// Optional<Product> result = repository.findById(1L);
		// if (result.isPresent()) {
		// System.out.println(result);
		// } else {
		// System.out.println("Product record not found!");
		// }
		// repository.findAll().forEach(p -> System.out.println("ID: " + p.getId() + ",
		// Name: " + p.getName()
		// + ", Description: " + p.getDescription() + ", Price: " + p.getPrice()));

		System.out.println(repository.findByName("iphone 11"));
		System.out.println(repository.findByPrice(42000d));
		System.out.println(repository.findByNameAndPrice("iphone 12", 64991d));
	}

}
