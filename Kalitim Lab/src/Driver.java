
public class Driver {
	public static void main(String[] args) {
		Kisi kisi = new Kisi();
		kisi.setIsim("Resat Onur");
		System.out.println(kisi.getIsim());
		
		System.out.println("----------------");
		
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setIsim("Emre Alci");
		ogrenci.setDers("Mat");
		System.out.println(ogrenci.getIsim());
		System.out.println(ogrenci.getDers());
		
		System.out.println("----------------");
		
		UniOgrenci uniOgrenci = new UniOgrenci();
		uniOgrenci.setIsim("Resat Onur");
		uniOgrenci.setDers("Fizik");
		uniOgrenci.setKampus("Ytu Davutpasa");
		System.out.println(uniOgrenci.getIsim());
		System.out.println(uniOgrenci.getDers());
		System.out.println(uniOgrenci.getKampus());
		
		System.out.println("----------------");
		
		Ogretmen ogretmen = new Ogretmen();
		ogretmen.setIsim("Ibrahim Emiroglu");
		ogretmen.setOkul("Ytu");
		System.out.println(ogretmen.getIsim());
		System.out.println(ogretmen.getOkul());
		
		System.out.println("----------------");
		
		
		Doktor doktor = new Doktor();
		doktor.setIsim("Bora Aydin");
		doktor.setBrans("Cildiye");
		
		System.out.println(doktor.getIsim());
		System.out.println(doktor.getBrans());
		
		//Java coklu kalitimi desteklemiyor unutma
	}
}
