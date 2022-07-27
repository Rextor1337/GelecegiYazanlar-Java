
public class DbConnection {
	public void openConnection() {
		System.out.println("Veritabanin baglantisi acildi");
	}
	
	public void closeConnection() {
		System.out.println("Veritabanin baglantisi kapatildi");
		
	}
	
	public void executeQuery(String sql) {
		System.out.println("Sql komutlari calistirildi");
	}
	
}
