import java.util.Arrays;

public class Driver {
	
	private static int x = 20;
	
	public static void main(String[] args) {
		Driver driver = new Driver ();
		driver.normalMetot();
		
		
		
		Driver.staticMetot();
		 int x =  Driver.max(2, 4, 1);
		 System.out.println(x);
		 
		 double max2 = Driver.max(2.1, 3.1, 4.8);
		 System.out.println(max2);
		 
		 boolean majority = Driver.majority(false, false, true);
		 System.out.println(majority);
		 
		 int[] x1 = {1,2,3,4,5};
		 int[] x2 = {1,2,3,4,12};
		 System.out.println(Driver.eq(x1, x2));
		 System.out.println(Driver.cube(2));
		 int[] numbers = {1,3,4,1,2,4,5,23,1,};
		 System.out.println(toplama(numbers));
		 
		 int[] sonucCifSayilar = Driver.cifsayilar(new int[] {1,2,3,4,5,6,7,8,9,10});
		 System.out.println(Arrays.toString(sonucCifSayilar));
		 
		 int y1 = 10;
		 int y2 = 20;
		 int[] sayilar = {2,3};
		 System.out.println(Arrays.toString(sayilar));
		 Driver.degistir(sayilar);
		 System.out.println(Arrays.toString(sayilar));
		 
		 
		 //System.out.println(y1+" "+y2);
		// degistir(y1,y2);					//boyle olmuyor
		 //System.out.println(y1+" "+y2);
		 
		}
	
	public static void degistir(int[] sayilar) {
		
		int temp = sayilar[0];
		sayilar[0] = sayilar[1];
		sayilar[1]=temp;
		
	}
	
	
	public static int[] cifsayilar(int[] sayilar) {
		
		int[] sonuc = null;
		int adet = 0;
		for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i]%2 == 0) {
				adet++;
			}
		}
		
		sonuc = new int[adet];
		int index = 0 ;
		for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i] % 2 ==0) {
				sonuc[index++] = sayilar[i];
			}
		}
		return sonuc;
		
	}
	
	
	public static int toplama(int[] x) {
		int result = 0;
		for (int i = 0; i < x.length; i++) {
			result += x[i];
		}
		return result;
		
	}
	
	public static int cube(int x) {
		return x*x*x;
		
	}
	
	
	
	public static boolean eq(int[] x,int[] y) {
		boolean result = false;
		if (x.length == y.length) {
			for (int i = 0; i < x.length; i++) {
				if (x[i] != y[i]) {
					result = false;
					break;
					
				}else {
					result =  true;
				}
				
				
			}
		}
		else {
			result = false;
		}
		return result;
	}
	
	
	
	public void normalMetot() {
		System.out.println(x);
	}
	
	public static void staticMetot() {
		
		//System.out.println(x); ulasamam statik yapmam lazim x i
		System.out.println(x);
	}
	
	public static int max(int x , int y , int z) {
		int max = x;
		if (y>max) max = y;
		if (z>max) max = z;
		return max;
	}
	
	public static double max(double x , double y ,double z) {
		double max = x;
		if (y > max) max = y;
		if (z > max) max = z;
		return (float)max;
		
	}
	
	public static boolean majority(boolean x , boolean y , boolean z) {
		
		return (x && y) || (x&&z) || (y&&z);
		
	}
	

}
