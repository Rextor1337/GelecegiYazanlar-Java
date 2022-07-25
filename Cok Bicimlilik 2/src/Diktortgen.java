
public class Diktortgen extends Sekil {
	
	private int genislik;
	private int yukseklik;
	
	public Diktortgen(int g , int y) {
		genislik = g;
		yukseklik = y;
	}
	
	public int getGenislik() {
		return genislik;
	}
	
	public void setGenislik(int g) {
		
		genislik = g;
		
	}
	
	public int getYukseklik() {
		return yukseklik;
	}
	
	public void setYukseklik(int y) {
		
		yukseklik = y;
		
	}
	
	public void alan() {
		System.out.println("Diktortgen alan: " + yukseklik*genislik);
	}

}
