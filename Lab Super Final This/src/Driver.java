
public class Driver {
	public static void main(String[] args) {
		Arac arac = new Arac("31778", "Opel");
		
		arac.yazdir();
		
		System.out.println("-------------------");
		
		Araba araba = new Araba("123131","Nissan",4, 4);
		araba.yazdir();
	}
}
