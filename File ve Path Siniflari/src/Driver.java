import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		
		/*
		File file = new File("C:\\Users\\user\\Desktop\\sample.txt");
		System.out.println(file.exists());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.isDirectory());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getParent());
		System.out.println(file.length());
		System.out.println(file.lastModified());
		System.out.println(new Date(file.lastModified()));
		
		File file2 = new File("C:\\Users\\user\\Desktop\\ornek.txt");
		/*if (file2.exists() == false) {
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		/*
		
		if (file2.exists()) {
			boolean silindimi =  file2.delete();
			System.out.println(silindimi);
		}*/
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dosya Yolu:");
		String path = scanner.nextLine();
		
		File file = new File(path);
		String[] icerik = file.list();
		for (int i = 0; i < icerik.length; i++) {
			System.out.println(icerik[i]);
		}
		scanner.close();
	}
}
