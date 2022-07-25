
public class Driver {

	public static void main(String[] args) {
		NakliyeAraci nakliyeAraci = new NakliyeAraci();
		nakliyeAraci.setUretici("X Marka");
		nakliyeAraci.setYukKapasitesi(10000);
		
		Tir tir = new Tir();
		tir.setUretici("Y marka");
		tir.setYukKapasitesi(20000);
		tir.setKonyteynerSayisi(2);
		
		Bisiklet name1 = new Bisiklet();
		name1.setUretici("Decathlon");
		name1.setGidonYuksekligi(6);
		name1.setYolcuSayisi(1);
		System.out.println(name1.getGidonYuksekligi() +" "+ name1.getUretici());
		
	}
}
