import java.util.Scanner;

public class DRiver {
	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Yasiniz:");
		int age = scanner.nextInt();
		System.out.println(age >= 18 ? "ehliyet alabilirsim" : "alamazsin"); // true ise 1. degilde iki noktadan sonraki
		
		
		
	}
}
