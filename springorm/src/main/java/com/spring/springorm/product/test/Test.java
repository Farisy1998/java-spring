package com.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springorm.product.dao.ProductDAO;
import com.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springorm/product/test/Config.xml");
		ProductDAO dao = (ProductDAO) context.getBean("productdao");
		Product product = new Product();
		List<Product> productList = dao.findAll();
		System.out.println("Products Record: ");
		for (Product prdt : productList) {
			System.out.println("ID: " + prdt.getId() + ", Name: " + prdt.getName() + ", Description: " + prdt.getDes()
					+ ", Price" + prdt.getPrice());
		}
	}

}
