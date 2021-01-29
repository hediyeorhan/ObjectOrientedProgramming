// CLASS MAIN
import java.util.Scanner;



public class Main {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args)
	{
		int menu;
		Departman[] departmanlar = BilgileriAl();
		while(1==1)
		{
			System.out.println("\t\t\t---------------------------------------------------------\t\t\t\n\t\t\t1))Bilgileri Listele\n\t\t\t2)Departman Adina Gore Arama Yap\n\t\t\t3)Personel Adina Gore Arama Yap\n\t\t\t4)Servis Guzergâhina Gore Arama Yap\n\t\t\t5)Yasi En Buyuk ve En Kucuk Personel/Personelleri Bul\n\t\t\t6)Cikis\n\t\t\t---------------------------------------------------------\n");
			System.out.print("Menu seciniz : ");
			menu = scanner.nextInt();
			switch(menu)
			{
			case 1:
				Departman.BilgileriListele(departmanlar);
				break;
			case 2:
				Departman.DepartmanArama(departmanlar);
				break;
			case 3:
				Personel.PersonelAdArama(departmanlar);
				break;
			case 4:
				Servis.ServisGuzergahArama(departmanlar);
				break;
			case 5:
				Personel.EnBuyukveEnKucukPersonel(departmanlar);
				break;
			case 6:
				System.out.println("\nPROGRAMDAN CIKILIYOR..\n");
				return;
			default:
				System.out.println("\nGECERSIZ MENU SECTINIZ !\n");
				break;
				
			}
		}
		
	}
	
	 public static Departman[] BilgileriAl()
	{
		
		int depsayi, persayi, sersayi;
		
		System.out.print("Kac adet departman bilgisi gireceksiniz? : ");
		depsayi = scanner.nextInt();
		
		Departman[] departmanlar = new Departman[depsayi];
		
		String depad;
	    int depno;
		
		for(int i=0; i<depsayi; i++)
		{   
			System.out.println("\n-----------------------------------------------------------------\n");
			System.out.print((i+1) + ". Departman no giriniz : ");
			depno = scanner.nextInt();
	
			System.out.print((i+1) + ". Departman adi giriniz : ");
			scanner.nextLine();
			depad = scanner.nextLine();
			
			
			System.out.print("Kac adet personel bilgisi gireceksiniz? : ");
			persayi = scanner.nextInt();
			Personel[] personeller = new Personel[persayi];
			
			
			for(int j=0; j<persayi; j++)
			{   int peryas; 
				String perad, persoyad;
				
				scanner.nextLine();
				System.out.print((j+1) + ". Personel adini giriniz : ");
				perad = scanner.nextLine();
				
				
				System.out.print((j+1) + ". Personel soyadini giriniz : ");
				persoyad = scanner.nextLine();
				
				
				System.out.print((j+1) + ". Personel yasini giriniz : ");
				peryas = scanner.nextInt();
				
				personeller[j] = new Personel(depno, perad, persoyad, peryas);
				System.out.println("\n");
				
			}
			
			System.out.print("Kac adet servis bilgisi gireceksiniz? : ");
			sersayi = scanner.nextInt();
			scanner.nextLine();
			Servis[] servisler = new Servis[sersayi];
			
			for(int z=0; z<sersayi; z++)
			{
				String guzergah;
			
				
				System.out.print((z+1) + ". Servis guzergahini giriniz : ");
                guzergah = scanner.nextLine();

				servisler[z] = new Servis(depno, guzergah);

			}
         
			departmanlar[i] = new Departman(depno, depad, personeller, servisler);
		
		}
		return departmanlar;
	}



}

// CLASS SERVIS
import java.util.Scanner;


public class Servis{
	private int depNo;
	private int servisID;
	private String servisGuzergah;
	private static int sayac = 0;
	
	static Scanner scanner = new Scanner(System.in);
	
	public Servis(int depNo, String servisGuzergah) {
	
		this.depNo = depNo;
		this.servisID = ++sayac;
		this.servisGuzergah = servisGuzergah;
	}
	
	public int getDepNo() {
		return depNo;
	}
	public int getServisID() {
		return servisID;
	}
	public String getServisGuzergah() {
		return servisGuzergah;
	}
	public void setServisGuzergah(String servisGuzergah) {
		this.servisGuzergah = servisGuzergah;
	}
	
	public static void ServisGuzergahArama(Departman[] departmanlar) {
		String guzergah;
		System.out.print("Aramak istediginiz guzergahi giriniz : ");
		guzergah = scanner.nextLine();
		
		int kontrol = 0;
		
		for(int i=0; i<departmanlar.length; i++)
		{
			for(int z=0; z<departmanlar[i].servisler.length; z++)
			{
				if(guzergah.equals(departmanlar[i].servisler[z].getServisGuzergah()))
				{
					System.out.println("\nARANAN GUZERGAHTA SERVIS BULUNDU.\n");
					kontrol = 1;
					System.out.println("\tDepartman No : " + departmanlar[i].servisler[z].getDepNo());
					System.out.println("\tDepartman Ad : " + departmanlar[i].getDepAd());
					System.out.println("\tServis ID : " + departmanlar[i].servisler[z].getServisID());
					System.out.println("\tServis Guzergah : " + departmanlar[i].servisler[z].getServisGuzergah());
				}
			}
		}
		if(kontrol == 0)
		{
			System.out.println("\nARANAN GUZERGAHTA SERVIS BULUNAMADI.\n");
		}
		
	}

}


// CLASS DEPARTMAN
import java.util.Scanner;


public class Departman {
	
	private int depNo;
	private String depAd;
	public Personel[] personeller;
	public Servis[] servisler;
	
	static Scanner scanner = new Scanner(System.in);
	
	public Departman(int depNo, String depAd, Personel[] personeller, Servis[] servisler) {
		this.depNo = depNo;
		this.depAd = depAd;
		this.personeller = personeller;
		this.servisler = servisler;
	}
	
	public int getDepNo() {
		return depNo;
	}
	public void setDepNo(int depNo) {
		this.depNo = depNo;
	}
	public String getDepAd() {
		return depAd;
	}
	public void setDepAd(String depAd) {
		this.depAd = depAd;
	}
	
	
	public static void BilgileriListele(Departman[] departmanlar)
	{
		System.out.println("\t\t --- BILGILER --- ");
		for(int i=0; i<departmanlar.length; i++)
		{
			System.out.println("\t" + (i+1) +". Departman No : " + departmanlar[i].getDepNo());
			System.out.println("\t" + (i+1) +". Departman Ad : " + departmanlar[i].getDepAd());
			System.out.println("\t ***  " + departmanlar[i].getDepAd()+" DEPARTMANINDAKI PERSONELLER  *** ");
			for(int j=0; j<(departmanlar[i].personeller).length; j++)
			{
				System.out.println("\t" + (j+1) + ". Personel ID : " + departmanlar[i].personeller[j].getPerID());
				System.out.println("\t" + (j+1) + ". Personel Ad : " + departmanlar[i].personeller[j].getPerAd());
				System.out.println("\t" + (j+1) + ". Personel Soyad : " + departmanlar[i].personeller[j].getPerSoyad());
				System.out.println("\t" + (j+1) + ". Personel Yas : " + departmanlar[i].personeller[j].getPerYas());
			}
			System.out.println("\t ***  " + departmanlar[i].getDepAd()+" DEPARTMANINDAKI SERVISLER  *** ");
			for(int z=0; z<(departmanlar[i].servisler).length; z++)
			{
				System.out.println("\t" + (z+1) + ". Servis ID : " + departmanlar[i].servisler[z].getServisID());
				System.out.println("\t" + (z+1) + ". Servis Guzergah : " + departmanlar[i].servisler[z].getServisGuzergah());
			}
			
			System.out.println("\n-----------------------------------------------------------------\n");
		}
	}
	
	public static void DepartmanArama(Departman[] departmanlar)
	{
		String aranacak;
		System.out.print("Aramak istediginiz departman adini giriniz : ");
		aranacak = scanner.nextLine();
		int kontrol = 0;
		
		for(int i=0; i<departmanlar.length; i++)
		{
			if(aranacak.equals(departmanlar[i].getDepAd()))
			{
				kontrol = 1;
				System.out.println("\nDEPARTMAN BULUNDU.\n");
				System.out.println("\tDepartman No : " + departmanlar[i].getDepNo());
				System.out.println("\tDepartman Ad : " + departmanlar[i].getDepAd());
				System.out.println("\t ***  " + departmanlar[i].getDepAd()+" Departmanindaki PERSONELLER  *** ");
				for(int j=0; j<(departmanlar[i].personeller).length; j++)
				{
					System.out.println("\tDepartman No : " + departmanlar[i].personeller[j].getDepNo());
					System.out.println("\t" + (j+1) + ". Personel ID : " + departmanlar[i].personeller[j].getPerID());
					System.out.println("\t" + (j+1) + ". Personel Ad : " + departmanlar[i].personeller[j].getPerAd());
					System.out.println("\t" + (j+1) + ". Personel Soyad : " + departmanlar[i].personeller[j].getPerSoyad());
					System.out.println("\t" + (j+1) + ". Personel Yas : " + departmanlar[i].personeller[j].getPerYas());
				}
				System.out.println("\t ***  " + departmanlar[i].getDepAd()+" Departmanindaki SERVISLER  *** ");
				for(int z=0; z<(departmanlar[i].servisler).length; z++)
				{
					System.out.println("\tDepartman No : " + departmanlar[i].servisler[z].getDepNo());
					System.out.println("\t" + (z+1) + ". Servis ID : " + departmanlar[i].servisler[z].getServisID());
					System.out.println("\t" + (z+1) + ". Servis Guzergah : " + departmanlar[i].servisler[z].getServisGuzergah());
				}
				
				System.out.println("\n-----------------------------------------------------------------\n");
			}
		}
		if(kontrol == 0)
		{
			System.out.println("\nDEPARTMAN BULUNAMADI!\n");
		}
	}
	
	
	
	
	
	
}

// CLASS PERSONEL
import java.util.Scanner;


public class Personel{
	
	private int depNo;
	private int perID;
	private String perAd;
	private String perSoyad;
	private int perYas;
	private static int sayac = 0;
	

	static Scanner scanner = new Scanner(System.in);
	
	public Personel(int depNo, String perAd, String perSoyad, int perYas) {
		this.depNo = depNo;
		this.perID = ++sayac;
		this.perAd = perAd;
		this.perSoyad = perSoyad;
		this.perYas = perYas;
	}
	
	public int getDepNo() {
		return depNo;
	}
	public int getPerID() {
		return perID;
	}
	public String getPerAd() {
		return perAd;
	}
	public void setPerAd(String perAd) {
		this.perAd = perAd;
	}
	public String getPerSoyad() {
		return perSoyad;
	}
	public void setPerSoyad(String perSoyad) {
		this.perSoyad = perSoyad;
	}
	public int getPerYas() {
		return perYas;
	}
	public void setPerYas(int perYas) {
		this.perYas = perYas;
	}
	
	public static void PersonelAdArama(Departman[] departmanlar)
	{
		String aranacak;
		System.out.print("Aramak istediginiz personel adini giriniz : ");
		aranacak = scanner.nextLine();
		int kontrol = 0;
		
		for(int i=0; i<departmanlar.length; i++)
		{
			for(int j=0; j<departmanlar[i].personeller.length; j++)
			{
				if(aranacak.equals(departmanlar[i].personeller[j].getPerAd()))
				{
					System.out.println("\nPERSONEL BULUNDU.\n");
					kontrol = 1;
					System.out.println("\tDepartman No : " + departmanlar[i].personeller[j].getDepNo());
					System.out.println("\tDepartman Ad : " + departmanlar[i].getDepAd());
					System.out.println("\tPersonel ID : " + departmanlar[i].personeller[j].getPerID());
					System.out.println("\tPersonel Ad : " + departmanlar[i].personeller[j].getPerAd());
					System.out.println("\tPersonel Soyad : " + departmanlar[i].personeller[j].getPerSoyad());
					System.out.println("\tPersonel Yas : " + departmanlar[i].personeller[j].getPerYas());
				}
			}
		}
		if(kontrol == 0)
		{
			System.out.println("\nPERSONEL BULUNMADI.\n");
		}
	}
	
	
	
	public static void EnBuyukveEnKucukPersonel(Departman[] departmanlar) {
		int enbuyuk = 0, enkucuk = 0; 
		int i;
		enbuyuk = departmanlar[0].personeller[0].getPerYas();
		enkucuk = departmanlar[0].personeller[0].getPerYas();
		for(i=0; i<departmanlar.length; i++)
		{
			for(int j=0; j<departmanlar[i].personeller.length; j++)
			{
				
				if(departmanlar[i].personeller[j].getPerYas() > enbuyuk)
				{
					enbuyuk = departmanlar[i].personeller[j].getPerYas();
				
				}
			}
		}
		for(i=0; i<departmanlar.length; i++)
		{
			for(int j=0; j<departmanlar[i].personeller.length; j++)
			{
				
				if(departmanlar[i].personeller[j].getPerYas() < enkucuk)
				{
					enkucuk = departmanlar[i].personeller[j].getPerYas();
		
				}
			}
		}
		System.out.println("\n EN BUYUK ELEMAN \n");
		for(i=0; i<departmanlar.length; i++)
		{
			for(int j=0; j<departmanlar[i].personeller.length; j++)
			{
				if(enbuyuk == departmanlar[i].personeller[j].getPerYas())
				{
					System.out.println("\tDepartman No : " + departmanlar[i].personeller[j].getDepNo());
					System.out.println("\tDepartman Ad : " + departmanlar[i].getDepAd());
					System.out.println("\tPersonel ID : " + departmanlar[i].personeller[j].getPerID());
					System.out.println("\tPersonel Ad : " + departmanlar[i].personeller[j].getPerAd());
					System.out.println("\tPersonel Soyad : " + departmanlar[i].personeller[j].getPerSoyad());
					System.out.println("\tPersonel Yas : " + departmanlar[i].personeller[j].getPerYas());
					System.out.println("\n");
				}
			}
		}
		System.out.println("\n EN KUCUK ELEMAN \n");
		for(i=0; i<departmanlar.length; i++)
		{
			for(int j=0; j<departmanlar[i].personeller.length; j++)
			{
				if(enkucuk == departmanlar[i].personeller[j].getPerYas())
				{
					System.out.println("\tDepartman No : " + departmanlar[i].personeller[j].getDepNo());
					System.out.println("\tDepartman Ad : " + departmanlar[i].getDepAd());
					System.out.println("\tPersonel ID : " + departmanlar[i].personeller[j].getPerID());
					System.out.println("\tPersonel Ad : " + departmanlar[i].personeller[j].getPerAd());
					System.out.println("\tPersonel Soyad : " + departmanlar[i].personeller[j].getPerSoyad());
					System.out.println("\tPersonel Yas : " + departmanlar[i].personeller[j].getPerYas());
					System.out.println("\n");
				}
			}
		}
		
	}

}

