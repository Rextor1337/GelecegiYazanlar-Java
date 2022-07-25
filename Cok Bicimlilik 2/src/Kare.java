
public class Kare extends Sekil {
	
	private int kenarUzunlugu;
	
	public Kare(int u) {
		kenarUzunlugu = u;
	}
	
	private int getKenarUzunlugu() {
		return kenarUzunlugu;
	}
	
	private void setKenarUzunlugu(int u) {
		kenarUzunlugu = u;
	}
	
	public void alan() {
		System.out.println("Kare Alan: "+ (kenarUzunlugu * kenarUzunlugu));
	}
	
}
