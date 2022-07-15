import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	
	/*int number = 0;
	
	boolean result = number > 0;
	
	
	if (result) {
		System.out.println("Number pozitif sayidir");
		System.out.println("2.");
	}
	else {
		System.out.println("number negatif bir sayidir");
	}
	
	System.out.println("herturlu calisir");
	
	*/
	/*
	Scanner scanner = new Scanner(System.in);
	System.out.println("Sayi:");
	int sayi = scanner.nextInt();
	
	if(sayi >0) {
		System.out.println("pozitif");
	}
	else {
		System.out.println("nehatif");
	}
	
	if(sayi % 2 == 0) {
		System.out.println("cift");
	}
	else {
		System.out.println("tek");
	}*/
	
	/*int number = 75 ;
	
	if (number < 100) {
		System.out.println("sayin 100 den kucuk");
		if (number > 50) {
			System.out.println("sayi 50 den buyuk");
			
		}
		
	}*/
	
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("sayi giriniz");
	int number = scanner.nextInt();
	if (number < 100 && number >=10) {
		System.out.println("girdigin sayi 2 basamakli");
		
	}
	else if (number < 1000 && number >= 100) {
		System.out.println("sayi 3 basamakli");
		
	}
	else 
		System.out.println("sayi tek basamakli");
	
	
	
	
}
	
}
