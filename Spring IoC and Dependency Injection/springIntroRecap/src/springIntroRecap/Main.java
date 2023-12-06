package springIntroRecap;

import java.util.ArrayList;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		/*
		ICustomerDal[] customerDals = {new OracleCustomerDal(),new MsSqlCustomerDal(),new MySqlCustomerDal()};		
		for (ICustomerDal customerDal : customerDals) {
			customerDal.add();
		}
		*/
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); // "applicationContext.xml" dosyasını okuyacağımızı belirttik.
		
		//CustomerManager customerManager = new CustomerManager(context.getBean("database", ICustomerDal.class));
		//customerManager.add();
		
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		customerService.add();
		
		
		
		
	}

}
