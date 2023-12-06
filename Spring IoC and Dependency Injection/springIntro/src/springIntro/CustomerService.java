package springIntro;

public class CustomerService implements ICustomerService{
	
	// Farz edelim yeni bir arayüzle daha çalışmamız istendi(angular).Burası da onun service katmanı.(CustomerManager gibi)
	
	private ICustomerDal customerDal;
	
	public CustomerService(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	@Override
	public void add() {
		// TODO Auto-generated method stub
		//System.out.println("CustomerService");
		customerDal.add();
		
	}

}
