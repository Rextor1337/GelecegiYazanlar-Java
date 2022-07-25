
public class Calisan {
	
	private String isim;
	private String gorev ;
	private int maas;
	
	public Calisan(String i, String g, int m ) {
		isim = i;
		gorev = g;
		maas  = m;
	}
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String i) {
		isim = i;
	}
	public String getGorev() {
		return gorev;
	}
	public void setGorev(String g) {
		gorev = g;
	}
	
	public int getMaas() {
		return maas;
	}
	public void setMaas(int m) {
		maas = m;
	}
	
	public void ozet() {
		System.out.println("Isim: " + isim);
		System.out.println("Gorev: " + gorev);
		System.out.println("Maas: " + maas);
	}
	
	
}
