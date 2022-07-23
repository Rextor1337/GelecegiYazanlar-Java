import com.example.Araba;

public class Driver {

	public static void main(String[] args) {
		/*
		Ogrenci ogrenci = new Ogrenci();
		/*
		ogrenci.ad = "Resat";
		ogrenci.soyad = "Onur";
		ogrenci.numara = 1;
		
		
		ogrenci.numarayiYazdir();*/
		
		/*
		Araba araba = new Araba();
		
		araba.marka = "BMW";
		*/
		
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.ad = "Resat";
		ogrenci.soyad = "Onur";
		ogrenci.numara = 1;
		
		ogrenci.setYas(12);
		
		ogrenci.bilgileriYazdir();
	}
	
}
