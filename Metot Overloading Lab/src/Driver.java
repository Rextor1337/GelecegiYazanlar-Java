import java.util.Date;

public class Driver {
	public static void main(String[] args) {
		
		
		Calisan calisan1 = new Calisan();
		
		calisan1.bilgileriYazdir();
		System.out.println("---------------------");
		
		Calisan calisan2 = new Calisan("Matematik Muhendisligi");
		
		calisan2.bilgileriYazdir();
		System.out.println("---------------------");
		
		Calisan calisan3 = new Calisan("Matematik Muhendisligi","Resat Onur" );
		
		calisan3.bilgileriYazdir();
		System.out.println("---------------------");
		
		Calisan calisan4 = new Calisan("Matematik Muhendisligi","Resat Onur",new Date());
		
		calisan4.bilgileriYazdir();
		System.out.println("---------------------");
		
	}
}
