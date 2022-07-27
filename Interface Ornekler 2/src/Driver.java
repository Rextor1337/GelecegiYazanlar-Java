
public class Driver {
	public static void main(String[] args) {
		Yuzebilir yuzebilir = new Balik();
		yuzebilir.yuz();
		
		
		Ucabilir ucabilir = new Karga();
		ucabilir.uc();
		
		
		Karga karga = new Karga();
		karga.uc();
		karga.yuru();
	}
}
