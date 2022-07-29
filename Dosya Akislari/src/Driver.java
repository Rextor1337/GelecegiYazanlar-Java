import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Driver {
	public static void main(String[] args) {
		//Kaynaga erisip okuma
		File file = new File("Hello.txt");
		FileInputStream fileInputStream= null;
		try {
			fileInputStream = new FileInputStream(file);
			int c =0;
			while ((c = fileInputStream.read()) != -1 ) {
				System.out.print((char)c);
				
			}
			fileInputStream.read();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		//Kaynaga erisip veri yazma
		/*
		File file = new File("Hello.txt");
		FileOutputStream fileOutputStream= null;
		try {
			fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write("Merhaba".getBytes());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		*/
		
		
	}
}
