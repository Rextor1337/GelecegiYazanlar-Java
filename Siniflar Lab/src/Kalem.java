
public class Kalem {
	
	String marka;
	String tip;
	boolean doldurulabilir;
	boolean silinebilir;
	
	void yaz(String metin) {
		System.out.println(metin);
	}
	
	void tekrarDoldur() {
		if (doldurulabilir) {
			System.out.println("kalem dolduruldu");
		}else {
			System.out.println("kalem doldurulamaz");
		}
		
		
	}
	
	void sil() {
		if (silinebilir) {
			System.out.println("Yazi silindi");
		}else {
			System.out.println("yazi silinemez");
		}
		
	}
	
	
}
