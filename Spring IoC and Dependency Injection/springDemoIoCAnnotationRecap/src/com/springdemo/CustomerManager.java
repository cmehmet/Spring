package com.springdemo;

public class CustomerManager implements ICustomerService {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	@Override
	public void add() {
		// İş kodları yazılacak.
		System.out.println("CustomerManager çalıştı.");
		customerDal.add();
	}
}
