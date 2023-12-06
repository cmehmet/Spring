package com.springdemo;

public class CustomerService implements ICustomerService{
	private ICustomerDal customerDal;
	
	public CustomerService(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	@Override
	public void add() {
		// Farklı bir arayüz için iş kodları yazılacak.
		System.out.println("CustomerService çalıştı.");
		customerDal.add();
		
	}

}
