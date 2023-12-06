package springIntro;

public class CustomerManager implements ICustomerService{
	private ICustomerDal customerDal;
	
	//constructor injection --> Sektörün %99 u bunu kullanıyor. 
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	
	// setter injection ---> Pek kullanılmıyor.
//	public void setCustomerDal(ICustomerDal customerDal) {
//		this.customerDal = customerDal;
//	}
	
	public void add() {
		System.out.println("CustomerManager");
		customerDal.add();
	}

	

}
