package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		/*
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		//customerManager.add();
		
		//CustomerManager customerManager = new CustomerManager(context.getBean("database",ICustomerDal.class));
		//customerManager.add();
		
		//ICustomerService customerService = new CustomerManager(context.getBean("database",ICustomerDal.class));
		//customerService.add();
		
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		customerService.add();
		
		*/
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);
		
		//CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		//customerManager.add();
		
		//CustomerManager customerManager = new CustomerManager(context.getBean("database",ICustomerDal.class));
		//customerManager.add();
		
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		customerService.add();
		
		
				
	}

}
