
public class PostgreConnection extends DbConnection{
	
	public void openConnection() {
		System.out.println("Postgre baglantisi acildi");
	}
	
	public void closeConnection() {
		System.out.println("Postgre baglantisi kapatildi");
	}
	
	public void executeQuery(String sql) {
		System.out.println("Postgre komutlari calistirildi");
	}
	
}
