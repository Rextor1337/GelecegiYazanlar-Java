
public class Driver {
	
	
	public static boolean test() {
		
		System.out.println("test");
		return false;
	}
	
	public static void main(String[] args) {
		boolean b= false;
		boolean a = true;
		System.out.println(b);
		System.out.println(!b);
		System.out.println(b & false);
		System.out.println(b & true);
		System.out.println(b| true);
		System.out.println(b && false); //farki ilki false direk bakmadan false yapiyor
		System.out.println("-----------------");
		System.out.println(b && test());
		System.out.println(a && test());
		
	}

}
