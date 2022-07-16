
public class Telefon {
	
	TelefonTipi tip;
	String marka;
	String model;
	boolean wifi;
	boolean mobilVeri;
	
	boolean aramaVarmi;
	
	void aramaYap(String telefonNumarasi) {
		System.out.println(telefonNumarasi);
		aramaVarmi = true;
	}
	
	void aramayiSonlandir() {
		if (aramaVarmi) {
			System.out.println("Arama sonlandirildi");
		}	
	
	}
	
	void mesajGonder(String mesaj) {
		if (mobilVeri || wifi) {
			System.out.println("mesaj gonderildi");
		}else {
			System.out.println("gonderilemedi");
		}
	}

}
