package springIntro;

public class OracleCustomerDal implements ICustomerDal{
	
	private String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	
	@Override
	public void add() {
		// Oracle veri tabanı kodları çalışacak.
		System.out.println("Connection String : " + connectionString);
		System.out.println("Oracle veri tabanına eklendi.");
		
	}

}
