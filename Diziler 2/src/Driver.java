import java.util.Arrays;
import java.util.Iterator;

public class Driver {
	public static void main(String[] args) {
		
		/*
		int[][] numbers = new int[2][3];
		numbers[0][0] = 1; 
		numbers[0][1] = 2; 
		numbers[0][2] = 3; 
		
		numbers[1][0] = 4; 
		numbers[1][1] = 5; 
		numbers[1][2] = 6; 
		
		System.out.println(Arrays.toString(numbers));//boyle yazdirilmaz
		
		for (int i = 0; i<2;i++) {
			for (int j = 0 ; j<3;j++) {
				System.out.println(numbers[i][j]);
			}
		}
		*/
		
		String[][] ogrenciler = new String[3][3];
		ogrenciler[0][0] = "Ali1";
		ogrenciler[0][1] = "Ali2";
		ogrenciler[0][2] = "Ali3";
		
		ogrenciler[1][0] = "Ali4";
		ogrenciler[1][1] = "Ali5";
		ogrenciler[1][2] = "Ali6";
		
		ogrenciler[2][0] = "Ali8";
		ogrenciler[2][1] = "Ali9";
		ogrenciler[2][2] = "Ali0";
		
		for(int i=0 ; i< ogrenciler.length; i++) {
			for (int j= 0; j< ogrenciler[i].length; j++) {
				System.out.println(ogrenciler[i][j]);
			}
		}
		
		
	}


}
