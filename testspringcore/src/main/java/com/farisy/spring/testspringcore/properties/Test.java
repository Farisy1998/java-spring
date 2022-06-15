package com.farisy.spring.testspringcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/farisy/spring/testspringcore/properties/Config.xml");
		CountriesAndLanguages countriesAndLanguage = (CountriesAndLanguages) context.getBean("CountriesAndLanguages");
		System.out.println("Countries and languages: "+countriesAndLanguage.getCountryAndLanguage());
	}

}
