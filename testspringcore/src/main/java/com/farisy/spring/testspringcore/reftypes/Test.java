package com.farisy.spring.testspringcore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/farisy/spring/testspringcore/reftypes/Config.xml");
		Student student = (Student) context.getBean("student");
		Scores scores = student.getScores();
		System.out.println("Maths: "+scores.getMaths());
		System.out.println("Physics: "+scores.getPhysics());
		System.out.println("Chemistry: "+scores.getChemistry());
	}

}
