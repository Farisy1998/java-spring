package com.farisy.spring.testspringcore.lc.ticketreservation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/farisy/spring/testspringcore/lc/ticketreservation/Config.xml");
		TicketReservation ticketreservation = (TicketReservation) context.getBean("ticketreservation");
		System.out.println(ticketreservation.getTicketno());
		context.registerShutdownHook();
	}
}
