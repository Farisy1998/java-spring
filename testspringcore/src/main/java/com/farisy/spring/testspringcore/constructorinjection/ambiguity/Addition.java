package com.farisy.spring.testspringcore.constructorinjection.ambiguity;

public class Addition {
	
	Addition(int n1, double n2) {
		System.out.println("Inside constuctor");
		System.out.println(n1);
		System.out.println(n2);
	}
	
}
