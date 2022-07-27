
public class Driver {
	public static void main(String[] args) {
		Elma[] elmalar = new Elma[10];
		elmalar[0] = new Elma(10, "Sari");
		elmalar[1] = new Elma(12, "kirmizi");
		elmalar[2] = new Elma(13, "Sari");
		elmalar[3] = new Elma(15, "Sari");
		elmalar[4] = new Elma(11, "kirmizi");
		elmalar[5] = new Elma(15, "Sari");
		elmalar[6] = new Elma(17, "Sari");
		elmalar[7] = new Elma(13, "yesil");
		
		elmalar[8] = new Elma(133, "kirmizi");
		
		elmalar[9] = new Elma(143, "Sari");
		
		renkFiltrele("Sari", elmalar);
		System.out.println("--------------");
		agirlikFiltrele(15, elmalar);
		System.out.println("--------------");
		agirlikFiltrele2(15, elmalar);
		
		
	}
	
	
	public static void renkFiltrele(String renk , Elma[] elmalar) {
		for (int i = 0; i < elmalar.length; i++) {
			Elma elma =  elmalar[i];
			if (elma.getRenk().equals(renk)) {
				System.out.println(elma.getRenk() + " " + elma.getAgirlik());
			}
		}
	}
	
	public static void agirlikFiltrele(int agirlik , Elma[] elmalar) {
		for (int i = 0; i < elmalar.length; i++) {
			Elma elma = elmalar[i];
			if (elma.getAgirlik() >= agirlik) {
				System.out.println(elma.getRenk() + " " + elma.getAgirlik());
				
			}
		}
	}
	
	public static void agirlikFiltrele2(int agirlik , Elma[] elmalar) {
		for (int i = 0; i < elmalar.length; i++) {
			Elma elma = elmalar[i];
			if (elma.getAgirlik() <= agirlik) {
				System.out.println(elma.getRenk() + " " + elma.getAgirlik());
				
			}
		}
	}
}
