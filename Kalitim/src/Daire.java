
public class Daire extends Sekil {
	
	private int r;
	
	public int getR() {
		return r;
	}
	
	public void setR(int _r) {
		r = _r;
	}
	
	public void alanHesapla() {
		System.out.println("Alan: " + (Math.PI*r*r));
	}

}
