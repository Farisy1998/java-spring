package com.farisy.spring.testspringcore.wsclient;

public class WSClient {
	private String dbUrl;
	private String dbUserName;
	private String dbPassword;
	
	public WSClient(String dbUrl, String dbUserName, String dbPassword) {
		// TODO Auto-generated constructor stub
		this.dbUrl = dbUrl;
		this.dbUserName = dbUserName;
		this.dbPassword = dbPassword;
	}

	@Override
	public String toString() {
		return "WSClient [dbUrl=" + dbUrl + ", dbUserName=" + dbUserName + ", dbPassword=" + dbPassword + "]";
	}
	
}
