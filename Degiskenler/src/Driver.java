
public class Driver {
	
	public static void main(String[] args) {
		
		//degiskenler
		
		byte b;
		b = 10;
		System.out.println(b);
		short s = 20;
		System.out.println(s);
		int i = 30;
		System.out.println(i);
		
		float pi = 3.14f;
		System.out.println(pi);
		
		char c = 'a';
		System.out.println(c);
		
		boolean bool = true;
		System.out.println(bool);
		
		//stringler:
		
		char chars[] = {'a','b','c'};
		String s1 = new String(chars);
		System.out.println(s1.length());
		
		String firstName = "John";
		System.out.println(firstName);
		System.out.println(firstName.charAt(1));
		System.out.println(firstName.toUpperCase());
		System.out.println(firstName.toLowerCase());
		System.out.println(firstName.replace('o', 'i'));
		System.out.println(firstName.length());
		System.out.println(firstName.substring(2));
		
		
		
	}

}
