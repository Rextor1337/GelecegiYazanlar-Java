import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sinav notu:");
		
		int score = scanner.nextInt();
		
		if (score >= 90 && score <= 100) {
			System.out.println("AA");
			
		}
		else if (score >= 80 && score < 90) {
			System.out.println("BB");
			
		}
		else if (score >= 70 && score < 80) {
			System.out.println("CC");
			
		}
		else if (score >= 50 && score < 70) {
			System.out.println("DC");
			
		}
		else {
			System.out.println("gecemedin yada 0 ile 100 arasinda not girilmemis");
		}
	}

}
