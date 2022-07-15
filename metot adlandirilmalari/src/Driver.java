
public class Driver {
	
	private void helloWorld() {
		
		System.out.println("Hello World");
	
		
	}
	
	
	private int topla(int x , int y) {
		
		int toplam = x+y;
		return toplam;
		
	}
	
private float topla(float x , int y) {
		
		float toplam = x+y;
		return (float)toplam;
		
	}

private float topla(float x , float y) {
	
	float toplam = x+y;
	return (float)toplam;
	
}

private float topla(byte x , byte y) {
	
	int toplam = x+y;
	return toplam;
	
}
	
	
	
	public static void main(String[] args) {
		
		new Driver().helloWorld();
		
		Driver driver =  new Driver();
		int sonuc = driver.topla(20, 300);
		
		System.out.println(sonuc);
		
	}
	
}
