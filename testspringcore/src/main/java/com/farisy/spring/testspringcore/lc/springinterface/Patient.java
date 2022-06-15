package com.farisy.spring.testspringcore.lc.springinterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		//System.out.println("Inside setter()");
	}

//	public void hi() {
//		System.out.println("Inside hi()");
//	}

//	public void bye() {
//		System.out.println("Inside bye()");
//	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside afterPropertiesSet()");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside destroy()");
	}
}
