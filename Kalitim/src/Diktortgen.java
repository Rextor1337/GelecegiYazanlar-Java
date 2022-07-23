
public class Diktortgen extends Sekil {
	
	private int uzunluk;
	private int yukseklik;
	
	public int getUzunluk() {
		return uzunluk;
		
	}
	
	public void setUzunluk(int _uzunluk) {
		uzunluk = _uzunluk;
	}
	public int getyukseklik() {
		return uzunluk;
		
	}
	
	public void setYukseklik(int _yukseklik) {
		yukseklik = _yukseklik;
	}
	
	public void alanHesapla() {
		System.out.println("Alan: " + (uzunluk*yukseklik));
	}
	
}
