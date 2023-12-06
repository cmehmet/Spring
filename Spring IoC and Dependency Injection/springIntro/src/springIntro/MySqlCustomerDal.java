package springIntro;

public class MySqlCustomerDal implements ICustomerDal {
	private String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	@Override
	public void add() {
		// MySql veri tabanı kodları yazılacak.
		System.out.println("Connection String : " + connectionString);
		System.out.println("MySql veri tabanına eklendi.");
	}
	
}
