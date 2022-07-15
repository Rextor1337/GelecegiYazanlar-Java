import java.time.DayOfWeek;

public class Driver {
	
	public static void main(String[] args) {
		
		Aylar ay = Aylar.OCAK;
		System.out.println(ay);
		
		
		ay = Aylar.EKIM;
		System.out.println(ay);
		
		Aylar[] values = Aylar.values();
		
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		
		Aylar valuesOf = Aylar.valueOf("SUBAT");
		System.out.println(valuesOf);
		
		DayOfWeek friday = DayOfWeek.FRIDAY;
		System.out.println(friday);
		
		DayOfWeek of = DayOfWeek.of(3);
		System.out.println(of);
		
	}
	

}
