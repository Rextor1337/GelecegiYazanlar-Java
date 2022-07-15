import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Driver {
	
	public static void main(String[] args) {
		
		/*
		int x;
		x = 10;
		//x++;
		//x = x+1
		System.out.println(x++);
		System.out.println(x);
		
		System.out.println(--x);
		
		System.out.println(5%2);
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("sayi gir");
		int a = scanner.nextInt();
		System.out.println(a % 2 == 0 ? " cift sayi" : "tek sayi");
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Parola:");
		String password = scanner.nextLine();
		boolean isOK = password.equals("1234");
		System.out.println(isOK ? " doru" : "yannis");
	}

}
