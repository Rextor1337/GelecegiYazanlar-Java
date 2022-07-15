import java.util.Scanner;

public class Driver {
	
	public static void merhaba() {
		System.out.println("Merhaba");
	}
	
	public int topla(int x , int y) {
		int toplam = x + y;
		return toplam;
	}
	
	
	public static void main(String[] args) {
		
		/*Driver driver = new Driver();  ///statik degilse boyle cagirman lazim
		driver.merhaba();*/
		
		//merhaba();
		
		
		/*
		Driver driver = new Driver();
		
		Scanner scanner = new Scanner(System.in);
		
		
		int sonuc = driver.topla(scanner.nextInt(),scanner.nextInt());
		System.out.println(sonuc);
		*/
		
		
		HesapMakinesi hesapMakinesi = new HesapMakinesi();
		float toplama = hesapMakinesi.topla(4f, 6f);
		System.out.println(toplama);
		System.out.println(hesapMakinesi.cikar(6, 7));
		System.out.println(hesapMakinesi.bol(2f, 1.5f));
		
		System.out.println(hesapMakinesi.kare(6));
		System.out.println(hesapMakinesi.karekok(9));
		
		
	}
	

}
