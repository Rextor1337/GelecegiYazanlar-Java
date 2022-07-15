import java.util.Scanner;

public class Toplama {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int toplam = 0;
		int input = 0;
		do {
			System.out.println("Bir sayi giriniz:");
			input = scanner.nextInt();
			toplam += input;
			
			
		} while (input != 0);
		System.out.println("Toplami: " + toplam);
	}
	
	

}
