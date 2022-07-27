
public class Kamyon extends YukTasimaAraci {
	
	private int konteyner;
	
	public int getKonteyner() {
		return konteyner;
	}
	
	public void setKonteyner(int konteyner) {
		this.konteyner = konteyner;
	}
	
	
	
	public Kamyon(String plaka , String marka , int yuk , int konteyner) {
		super(plaka, marka, yuk);
		this.konteyner = konteyner;
	}
	
	@Override
	public void yazdir() {
		// TODO Auto-generated method stub
		super.yazdir();
		System.out.println("Konteyner say: " + konteyner);
	}
	
}
