import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		try {
			System.out.print("1.sayi: ");
			int x = scanner.nextInt();
			System.out.print("2.sayi: ");
			int y = scanner.nextInt();
			
			int sonuc = x / y;
			System.out.println("Sonuc: " + sonuc);
					
			
		} catch (ArithmeticException e) {
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("Hata: 0 a bolunemez");
		}catch (InputMismatchException e) {
			System.out.println("Hata: sayi giriniz");
		}finally {
			scanner.close(); //temizlik islemleri her turlu calisir
			System.out.println("Finally");
		}
		
		System.out.println("Uygulama kapandi");
		
	}
	
}
