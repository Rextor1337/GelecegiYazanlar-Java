import java.util.Date;

public class Calisan {
	
	private String isim;
	private double maas;
	private Date baslangic;
	
	//chain constructor ornegi:
	
	public Calisan() {
		this("Bilinmiyor");
	}
	
	public Calisan(String isim) {
		this(isim,0);
		
	}
	
	public Calisan(String isim , double maas) {
		this(isim,maas,null);
	}
	
	public Calisan(String isim , double maas, Date baslangic) {
		this.isim = isim;
		this.maas = maas;
		this.baslangic = baslangic;
	}
	
	
	public String getIsim() {
		return isim;
	}
	
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public double getMaas() {
		return maas;
	}
	
	public void setMaas(double maas) {
		this.maas = maas;
	}
	
	public Date getBaslangic() {
		return baslangic;
	}
	
	public void setBaslangic(Date baslangic) {
		this.baslangic = baslangic;
	}
	
	public void yazdir() {
		System.out.println("Isim: " + isim + "| Maas: " + maas + "| baslangic: " + baslangic );
	}
	
	
}
