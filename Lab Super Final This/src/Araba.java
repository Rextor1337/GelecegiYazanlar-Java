
public class Araba extends YolcuTasimaAraci{
	
	private int kapi;
	
	public Araba(String plaka, String marka, int kapasite , int kapi) {
		super(plaka, marka, kapasite);
		this.kapi = kapi;
	}
	
	public int getKapi() {
		return kapi;
	}
	
	public void setKapi(int kapi) {
		this.kapi = kapi;
	}
	
	@Override
	public void yazdir() {
		// TODO Auto-generated method stub
		super.yazdir();
		System.out.println("Kapi sayisi: " + kapi);
	}
	
}
