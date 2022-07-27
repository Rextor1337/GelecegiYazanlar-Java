
public class Kisi {
	
	private String tcno;
	private String isim;
	
	public Kisi() {
		
	}
	
	public Kisi(String tcno) {
		this.tcno = tcno;
	}

	public Kisi(String tcno , String isim) {
	this.tcno = tcno;
	this.isim = isim;
	}
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public String getTcno() {
		return tcno;
	}
	public void setTcno(String tcno) {
		this.tcno = tcno;
	}
	
	@Override
	public boolean equals(Object other) {
		Kisi kisi = (Kisi) other;
		return kisi.tcno.equals(this.tcno); //&& kisi.isim.equals(this.isim);
	}
	
	@Override
	public String toString() {
		return "Tc: " + tcno + ", Isim: " + isim;
	}
	
}
