
public class OracleDbConnection extends DbConnection{
	
	public void openConnection() {
		System.out.println("Oracle baglantisi acildi");
	}
	
	public void closeConnection() {
		System.out.println("Oracle baglantisi kapatildi");
	}
	
	public void executeQuery(String sql) {
		System.out.println("Oracle komutlari calistirildi");
	}
	
}
