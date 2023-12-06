package com.springdemo;

import org.springframework.stereotype.Component;

@Component("database")
public class MsSqlCustomerDal implements ICustomerDal {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("MsSql veritabanına eklendi.");
	}
	
}
