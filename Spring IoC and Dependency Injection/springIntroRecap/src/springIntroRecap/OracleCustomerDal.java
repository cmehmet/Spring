package springIntroRecap;

public class OracleCustomerDal implements ICustomerDal {
	
	private String connectionString;

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	@Override
	public void add() {
		// Oracle veritabanı kodları çalışacak
		System.out.println("Oracle veritabanına başarıyla eklendi.");
		
		System.out.println("Connection String : " + this.connectionString );
		
	
		
	}

}
