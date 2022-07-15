import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //input alma
		//=
		//String userInput = scanner.nextLine() ;
		//System.out.println(userInput);
		//System.out.println(userInput.toLowerCase());
		//=
		
		StringBuffer buffer = new StringBuffer();//toplanarak yazma
		System.out.print("Adiniz :");
		buffer.append("Ad: ");
		
		buffer.append(scanner.nextLine());
		System.out.print("Soyadiniz :");
		buffer.append(", Soyad: ");
		buffer.append(scanner.nextLine());
		
		
		System.out.println(buffer.toString());
	}

}
