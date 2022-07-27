import java.util.Scanner;

public class Driver {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		DbConnection connection = (DbConnection) Class.forName(args[0]).newInstance();
		
		connection.openConnection();
		connection.executeQuery("sql komutlari");
		connection.closeConnection(); // Run configurationdan arguman kisminda sinifin tam ismini yaz ona gore degisiyor
		
		
		
		/*
		System.out.println(args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		*/
		
		
		/*
		DbConnection connection = new DbConnection();
		connection.openConnection();
		connection.executeQuery("SELECT * FROM STUDENT");
		connection.closeConnection();
		
		System.out.println("----------------------");
		
		MySqlConnection connection2 = new MySqlConnection();
		connection2.openConnection();
		connection2.executeQuery("SELECT * FROM STUDENT");
		connection2.closeConnection();
		
		System.out.println("----------------------");
		
		MsSqlConnection connection3 = new MsSqlConnection();
		connection3.openConnection();
		connection3.executeQuery("SELECT * FROM STUDENT");
		connection3.closeConnection();
		*/
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Database tipi seciniz [1 (MsSql) , 2(MySql) , 3(OracleSql)] ");
		int dbType = scanner.nextInt();
		
		
		DbConnection dbConnection = null;
		
		switch (dbType) {
		case 1:
			dbConnection = new MsSqlConnection();
			break;
		case 2:
			dbConnection = new MySqlConnection();
			break;
		case 3:
			dbConnection = new OracleDbConnection();
			break;
			
		default:
			System.out.println("Yanlis veritabani secimi");
			break;
		}
		
		if (dbConnection != null) {
			dbConnection.openConnection();
			dbConnection.executeQuery("sql komutlari");
			dbConnection.closeConnection();
		}
		*/
		
		
		
		
		
	}
}
