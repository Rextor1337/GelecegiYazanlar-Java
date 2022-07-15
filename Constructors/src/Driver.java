
public class Driver {
	
	int x;
	
	public Driver () {
		System.out.println("Ctor = constructor");
		x=20;
	}
	
	
	
	public static void main(String[] args) {
		/*Driver driver = new Driver();
		System.out.println(driver.x);*/
		
		Ogrenci ogrenci = new Ogrenci("resat","onur",23);
		System.out.println(ogrenci.ad);
		System.out.println(ogrenci.soyad);
		System.out.println(ogrenci.yas);
		
	}
	

}
