import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Haftanin gunu:");
		int day = scanner.nextInt();
		
		switch (day) {
		case 1:
			System.out.println("pzt");
			break;
		case 2:
			System.out.println("sali");
			break;
		case 3:
			System.out.println("cars");
			break;
		case 4:
			System.out.println("pers");
			break;
		case 5:
			System.out.println("cuma");
			break;
			

		
		}
		
	}

}
