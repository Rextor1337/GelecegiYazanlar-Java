
public class YukTasimaAraci extends Arac{
	
	private int yuk;
	
	public YukTasimaAraci(String plaka, String marka , int yuk) {
		super(plaka, marka);
		this.yuk = yuk;
		
	}
	
	public void setYuk(int yuk) {
		this.yuk = yuk;
	}
	
	public int getYuk() {
		return yuk;
	}
	
	
	public void yazdir() {
		
		super.yazdir();
		System.out.println("Yuk Kap: " + yuk);
	}
	
}
