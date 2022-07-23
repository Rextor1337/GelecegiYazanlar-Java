
public class Kare {

	
	private int x;
	private int y;
	private int uzunluk;
	
	public int getX() {
		return x;
		
	}
	
	public void setX(int _x) {
		if (_x >= 0) {
			x = _x;
			
		}else {
			System.out.println("X -1 den bhuyuk olmali");
		}
		
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int _y) {
		if (_y >= 0) {
			y = _y;
			
		}else {
			System.out.println("Y -1 den bhuyuk olmali");
		}
	}
	
	public int getUzunluk() {
		return uzunluk;
	}
	
	public void setUzunluk(int _uzunluk) {
		
		if (_uzunluk >= 0) {
			uzunluk = _uzunluk;
			
		}else {
			System.out.println("UZUNLUK -1 den bhuyuk olmali");
		}
	}
	
	public void ekranaBastir() {
		System.out.println("X: " + x);
		System.out.println("Y: "+ y);
		System.out.println("UZUNLUK :" + uzunluk);
	}
}
