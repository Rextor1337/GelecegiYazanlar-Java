
public class Ogrenci {
	
	public int numara = 10;// private olunca mainde erisilemiyor
	public String ad;
	public String soyad;
	private int yas;
	
	
	//encapsulation: siniftaki degiskenleri private metotlari public yapma
	
	public void setYas(int y) {
		
		if (y>0) {
			yas = y;
			
		}else {
			System.out.println("yas degeri gecersiz");
		}
		
		
		
	}
	
	void bilgileriYazdir() {
		System.out.println("Ad: "+ad);
		System.out.println("Soyad: "+soyad);
		System.out.println("numara: "+numara);
		System.out.println("yas: "+yas);
	}

}
