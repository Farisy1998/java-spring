package com.farisy.spring.testspringcore.propertyplaceholder;

public class MyDAO {
	private String dbServer;
	private String dbPort;
	
	public MyDAO(String dbServer, String dbPort) {
		// TODO Auto-generated constructor stub
		this.dbServer = dbServer;
		this.dbPort = dbPort;
		
	}

	@Override
	public String toString() {
		return "MyDAO [dbServer=" + dbServer + ", dbPort="+dbPort+"]";
	}
}
