package com.farisy.spring.testspringcore.list;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/farisy/spring/testspringcore/list/ListConfig.xml");
		Hospital hospital = (Hospital) context.getBean("hospital");
		System.out.println("Hospital: "+hospital.getName());
		System.out.println("Departments: "+ hospital.getDepartments());
	}

}
