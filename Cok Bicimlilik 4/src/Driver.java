
public class Driver {
	public static void main(String[] args) {
		Keman keman = new Keman();
		keman.cal();
		keman.akorYap();
		
		System.out.println("--------------");
		
		Enstruman enstruman = new Davul();
		enstruman.cal();
		enstruman.akorYap();
	}
}
