package springIntroRecap;

public class MsSqlCustomerDal implements ICustomerDal{
	
	private String connectionString;

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	
	@Override
	public void add() {
		// MsSql veritabanı kodları çalışacak.
		System.out.println("MsSql veritabanına başarıyla eklendi.");
		
		System.out.println("Connection String : " + this.connectionString );
		
	}

}
