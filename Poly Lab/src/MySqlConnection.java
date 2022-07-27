
public class MySqlConnection extends DbConnection {
	
	public void openConnection() {
		System.out.println("MySql baglamtisi acildi");
	}
	
	public void closeConnection() {
		System.out.println("MySql baglamtisi kapatildi");
	}
	
	public void executeQuery(String sql) {
		System.out.println("MySql komutlari calistirildi");
	}
	
}
