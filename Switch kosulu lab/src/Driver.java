import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.sayi");
		float x = Float.parseFloat(scanner.nextLine()); //stringten floata cevirme
		System.out.println("2.sayi");
		float y = Float.parseFloat(scanner.nextLine());
		System.out.println("islem");
		char islem = scanner.nextLine().charAt(0);
		
		switch (islem) {
		case '+':
			System.out.println("Sonuc:" + (x+y));
			break;
		case '-':
			System.out.println("Sonuc:" + (x-y));
			break;
		case '*':
			System.out.println("Sonuc:" + (x*y));
			break;
		case '/':
			System.out.println("Sonuc:" + (x/y));
			break;
		default:
			System.out.println("?");
			break;
			
			/*
			 * case1:
			 * case2:
			 * case3:
			 * sysout;
			 * break;
			 * case4:
			 * case5:
			 * sysout;
			 * break;
			 */
			
		}
		
	}

}
