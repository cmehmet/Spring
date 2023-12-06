package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class OracleCustomerDal implements ICustomerDal {
	
	@Value("${database.connectionString}")
	private String connectionString;
	
	@Value("${local.email}")
	private String email;
	
	public String getConnectionString() {
		return connectionString;
	}
	
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void add() {
		//
		System.out.println("Oracle veritabanına eklendi.");
		System.out.println("Bağlantı Metni : " + connectionString);
		System.out.println("e-posta : " + email);
	}
	
}
