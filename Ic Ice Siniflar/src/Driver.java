
public class Driver {
	public static void main(String[] args) {
		Araba araba = new Araba();
		araba.setMarka("X marka");
		
		
		araba.setModel("Y model");
		
		
		Araba.Motor motor = araba.new Motor();//boyle olusturman lazim
		
		motor.setHacim(2122);
		araba.setMotor(motor);
		
		System.out.println(araba.getMarka());
		System.out.println(araba.getModel());
		System.out.println(araba.getMotor().getHacim());
	}
}
