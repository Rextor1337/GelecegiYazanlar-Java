
public class Driver {
public static void main(String[] args) {
	
	Sekil sekil = new Sekil();
	sekil.setPosX(12);
	sekil.setPosY(34);
	sekil.setRenk("Kirmizi");
	sekil.alanHesapla();
	
	
	Kare kare = new Kare();
	kare.setPosX(10);
	kare.setPosY(-1);
	kare.setRenk("siyah");
	kare.setKenarUzunlugu(10);
	kare.alanHesapla();
	
	//System.out.println(kare.getKenarUzunlugu());
	
	Diktortgen diktortgen = new Diktortgen();
	diktortgen.setPosX(20);
	diktortgen.setPosY(-12);
	diktortgen.setRenk("mavi");
	diktortgen.setYukseklik(10);
	diktortgen.setUzunluk(5);
	diktortgen.alanHesapla();
	
	Daire daire = new Daire();
	daire.setPosX(20);
	daire.setPosY(-12);
	daire.setRenk("kirmizi");
	daire.setR(10);
	daire.alanHesapla();

	
	
}
}
