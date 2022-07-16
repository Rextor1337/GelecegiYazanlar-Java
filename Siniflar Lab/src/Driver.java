import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		/*Kalem kursunkalem = new Kalem();
		kursunkalem.marka = "A marka";
		kursunkalem.tip = "Kursun";
		kursunkalem.doldurulabilir = false;
		kursunkalem.silinebilir = false;
		
		
		kursunkalem.yaz("Merhaba");
		kursunkalem.tekrarDoldur();
		kursunkalem.sil();
		
		
		Kalem kursunkalem1 = new Kalem();
		kursunkalem1.marka = "B marka";
		kursunkalem1.tip = "Dolma";
		kursunkalem1.doldurulabilir = true;
		kursunkalem1.silinebilir = false;
		
		kursunkalem1.yaz("Java ile NYP");
		kursunkalem1.tekrarDoldur();
		kursunkalem1.sil();
		*/
		
		/*
		Telefon telefon = new Telefon();
		telefon.marka = "X marka";
		telefon.model = "Y model";
		telefon.tip = TelefonTipi.CEP;
		telefon.mobilVeri = false;
		telefon.wifi = false;
		
		telefon.aramaYap("555");
		telefon.aramayiSonlandir();
		telefon.mesajGonder("Nasilsin");
		*/
		
		int komut;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Kopek bilgileri");
		System.out.println("2.Kostur");
		System.out.println("3.uyut");
		System.out.println("4.oturt");
		System.out.println("5.Yemek ver");
		komut = scanner.nextInt();
		
		Kopek kangal = new Kopek();
		kangal.cins = "Sivas kangali";
		kangal.boyut = Boyut.BUYUK;
		kangal.renk = Renk.KAHVERENGI;
		kangal.yas = 6;
		
		switch (komut) {
		case 1:
			
			System.out.println("Cinsi: "+kangal.cins);
			System.out.println("Boyutu: "+kangal.boyut);
			System.out.println("Rengi: "+kangal.renk );
			System.out.println("Yasi: "+kangal.yas);
			break;
		case 2:	kangal.kos();
		break;
			
			
		case 3:	kangal.otur();
		break;
		
		case 4:kangal.uyu();
		break;
		
		case 5:kangal.yemekYe();
		break;

		default:
			
		}
		
		
		
		
		
		
		
	}

}
