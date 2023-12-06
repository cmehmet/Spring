package com.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("database")
public class OracleCustomerDal implements ICustomerDal {
	
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
		// Oracle veritabanı kodları çalışacak
		System.out.println("Oracle veritabanına başarıyla eklendi.");
		
		System.out.println("Connection String : " + this.connectionString );
		
	
		
	}

}
