package com.springdemo;

import java.util.ArrayList;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		/*
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); //"applicationContext.xml" dosyasını okuyacağımızı belirttik.
		ICustomerDal customerDal = context.getBean("database",ICustomerDal.class);
		customerDal.add();
		*/
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		customerService.add();
				
		
	}
	
	//IoC - Inversion of Control
	//Dependency Injection
	//Spagetti Kod
	//SOLID

}
