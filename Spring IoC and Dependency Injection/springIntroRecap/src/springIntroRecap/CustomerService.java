package springIntroRecap;

public class CustomerService implements ICustomerService {
	
    private ICustomerDal customerDal;
	
    //Constructor Injection
	public CustomerService(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
    
	
    //Setter Injection
//	public void setCustomerDal(ICustomerDal customerDal) {
//		this.customerDal = customerDal;
//	}
		
	@Override
	public void add() {
		// Farklı bir arayüz için iş Kodları yazılır. İş kurallarından geçerse veriye erişimi çağırıyoruz.
		System.out.println("CustomerService çalıştı");
		customerDal.add();
	}

}
