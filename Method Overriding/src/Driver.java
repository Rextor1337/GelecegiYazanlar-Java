
public class Driver {
	public static void main(String[] args) {
		
		Kisi kisi = new Kisi("23", "Resat Onur");
		System.out.println(kisi.toString());
		
		Kisi kisi2 = new Kisi("23", "Resat ");
		System.out.println(kisi2.toString());
		
		System.out.println(kisi == kisi2);
		System.out.println(kisi.equals(kisi2));
		
	}
}
