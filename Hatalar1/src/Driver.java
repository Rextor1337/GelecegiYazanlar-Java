import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		
		//arithExcep();
		//arrayExcep();
		nullPointer();
		
		//bilerek sayi girisinde hata yap ve hatalari incele
		
	}
	
	public static void nullPointer() {
		Scanner scanner = null;
		String line =  scanner.nextLine();
		System.out.println(line);
	}
	
	public static void arrayExcep() {
		int[] numbers = {1,2,3,4,5};
		Scanner scanner = new Scanner(System.in);
		int index = scanner.nextInt();
		System.out.println(numbers[index]);
	}
	
	public static void arithExcep() {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		System.out.println(x / y);
	}
	
}
