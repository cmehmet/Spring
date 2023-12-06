package com.springdemo;

public class CustomerManager implements ICustomerService {
	private ICustomerDal customerDal;
	
	//Constructor Injection
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	
	@Override
	public void add() {
		// İş Kodları yazılır. İş kurallarından geçerse veriye erişimi çağırıyoruz(aşağıdaki kısım)
		System.out.println("CustomerManager çalıştı");
		customerDal.add();
		
	}
	
}
