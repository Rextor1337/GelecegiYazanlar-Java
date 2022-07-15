
public class Driver {
	
	public static void main(String[] args) {
		
		Daire daire;
		daire = new Daire();
		
		daire.x = 10.0;
		daire.y = 20.0;
		daire.r = 3.0;
		
		
		System.out.println(daire.r);
		System.out.println(daire.x);
		System.out.println(daire.y);
		
		double alan = daire.alanHesapla();
		double cevre=daire.cevreHesapla();
		
		System.out.println(alan);
		System.out.println(cevre);
		
		
		Daire daire2 = new Daire();
		daire2.r = 30 ;
		System.out.println(daire2.alanHesapla());
		System.out.println(daire2.cevreHesapla());
		
		Daire daire3 = daire2;
		daire3.r = 40;
		
		System.out.println(daire3.alanHesapla());
		System.out.println(daire3.cevreHesapla());
		
	}

}
