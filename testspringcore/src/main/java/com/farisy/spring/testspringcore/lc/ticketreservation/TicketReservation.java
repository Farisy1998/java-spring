package com.farisy.spring.testspringcore.lc.ticketreservation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	private int ticketno;

	public int getTicketno() {
		return ticketno;
	}

	public void setTicketno(int ticketno) {
		this.ticketno = ticketno;
		System.out.println("Inside setter()");
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("Inside initialize()");
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("Inside cleanUp()");
	}
	
}
