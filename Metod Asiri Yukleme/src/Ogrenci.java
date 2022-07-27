
public class Ogrenci {
	
	private String kimlik;
	private String ad;
	private String soyad;
	private String sinif;
	
	public Ogrenci() {
		
	}
	
	public Ogrenci(String kimlik) {
		this.kimlik = kimlik;
	}
	
	public Ogrenci(String kimlik,String ad) {
		this.kimlik = kimlik;
		this.ad = ad;
	}
	
	public Ogrenci(String kimlik,String ad, String soyad) {
		this.kimlik = kimlik;
		this.ad = ad;
		this.soyad = soyad;
	}
	
	public Ogrenci(String kimlik,String ad, String soyad,String sinif) {
		this.kimlik = kimlik;
		this.ad = ad;
		this.soyad = soyad;
		this.sinif = sinif;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getAd() {
		return ad;
	}
	public void setKimlik(String kimlik) {
		this.kimlik = kimlik;
	}
	public String getKimlik() {
		return kimlik;
	}
	public void setSinif(String sinif) {
		this.sinif = sinif;
	}
	public String getSinif() {
		return sinif;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getSoyad() {
		return soyad;
	}
	
}
