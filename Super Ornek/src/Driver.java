
public class Driver {
	public static void main(String[] args) {
		
		Kisi kisi = new Kisi("Resat Onur");
		System.out.println(kisi.getIsim());
		
		Ogrenci ogrenci = new Ogrenci("Resat Onur", 2);
		System.out.println(ogrenci.getIsim());
		System.out.println(ogrenci.getNumara());
		ogrenci.ozet();
		
	}
}
