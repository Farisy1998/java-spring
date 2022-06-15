package com.farisy.spring.testspringcore.lc.xmlconfig;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Inside setter()");
	}
	
	public void hi(){
		System.out.println("Inside hi()");
	}
	
	public void bye(){ 
		System.out.println("Inside bye()");
	}
}
