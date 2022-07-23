
public class Kare extends Sekil{
	
	private int kenarUzunlugu;
	
	public int getKenarUzunlugu() {
		return kenarUzunlugu;
	}
	
	public void setKenarUzunlugu(int uzunluk) {
		if (uzunluk >= 0) {
			
			kenarUzunlugu = uzunluk;
			
		}
		else {
			System.out.println("uzunluk 0 dan buyuk olmali");
			
		}
		
		
		
	}
	
	public void alanHesapla() {
		System.out.println("Alan: " + (kenarUzunlugu*kenarUzunlugu));
	}
	
}
