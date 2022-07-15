
public class Driver {
	
	public static void main(String[] args) {
		
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.isim = "Tugrul";
		ogrenci.yas = 8;
		
		System.out.println(ogrenci.isim);
		System.out.println(ogrenci.yas);
		
		
		Driver driver = new Driver();
		driver.ogrenciBilgileri(ogrenci);
		
	}
	
	public void ogrenciBilgileri(Ogrenci ogrenci) {
		
		ogrenci.isim = "Ertug";
		
		System.out.println(ogrenci.isim);
		System.out.println(ogrenci.yas);
		
	}
}
