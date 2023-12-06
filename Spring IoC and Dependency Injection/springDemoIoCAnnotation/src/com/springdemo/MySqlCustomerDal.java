package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class MySqlCustomerDal implements ICustomerDal{
	
	@Value("${database.connectionString}")
	private String connectionString;

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	
	@Override
	public void add() {
		// MySql veritabanı kodları çalışacak.
		System.out.println("MySql veritabanına eklendi.");
		
		System.out.println("Connection String : " + this.connectionString );
	}

}
