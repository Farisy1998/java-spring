package com.farisy.spring.testspringcoreadvanced.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("instr")
@Scope("prototype")
public class Instructor {

	String s = new String("kjg");

	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	int id;
	@Value("#{new java.lang.String('Farisy')}")
	String name;
	
	@Value("#{2+4>8?true:false}")
	private boolean active;

	@Value("#{topics}")
	private List<String> topics;

	@Autowired
	private Profile profile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instructor [s=" + s + ", id=" + id + ", name=" + name + ", active=" + active + ", topics=" + topics
				+ ", profile=" + profile + "]";
	}

}
