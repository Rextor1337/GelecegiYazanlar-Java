import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		//olusturma
		
		Scanner scanner =  new Scanner(System.in);
		System.out.print("Dosya Yolu :");
		String filePath = scanner.nextLine();
		File file = new File(filePath);
		if (!file.exists()) {
			try {
				boolean fileCreated = file.createNewFile();
				if (fileCreated) {
					System.out.println("dosya olusturuldu");
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
		//Yazma
		
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(file);
			String line = null;
			do {
				line = scanner.nextLine();
				fileWriter.write(line);
				fileWriter.write(System.lineSeparator());
				
			} while (!line.equals("quit"));
			
		//kapama islemleri
			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			}
		}
		
		scanner.close();
		System.out.println("Dosya yazdirma basarili");
		System.out.println("Dosya boyutu " + file.length()  + " byte");
		
	}
}
