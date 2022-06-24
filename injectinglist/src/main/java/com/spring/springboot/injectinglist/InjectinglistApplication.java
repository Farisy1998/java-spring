package com.spring.springboot.injectinglist;

import java.util.Arrays;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InjectinglistApplication {

	public static void main(String[] args) {
		SpringApplication.run(InjectinglistApplication.class, args);
	}

	@Bean
	public List<String> courseList() {
		return Arrays.asList("Java", "Python", "Node", "Spring boot");
	}

}
