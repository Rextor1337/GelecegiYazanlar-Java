
public class MsSqlConnection extends DbConnection {
	
	public void openConnection() {
		System.out.println("MsSql baglamtisi acildi");
	}
	
	public void closeConnection() {
		System.out.println("MsSql baglamtisi kapatildi");
	}
	
	public void executeQuery(String sql) {
		System.out.println("MsSql komutlari calistirildi");
	}
	
}
