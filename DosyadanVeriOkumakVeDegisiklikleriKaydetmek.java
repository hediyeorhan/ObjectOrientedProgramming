
// CLASS MAIN
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class Anasayfa {
	public static void main(String[] args) throws IOException
	{
		Scanner scanner = new Scanner(System.in);
		List<Kurs> eklenecek2 = new ArrayList<Kurs>();
		
		int id1 = 0, id2, yas = 0, menu;
		String[] dizi;
		String ad = null;
		
		List<Kursiyer> kursiyerler = new ArrayList<Kursiyer>();
		List<Kurs> kurslar = new ArrayList<Kurs>();
		
		try(Scanner scan = new Scanner(new FileReader("kursiyer.txt")))
        {
            while(scan.hasNext())
            {
                String bilgi = scan.nextLine();
                String[] array = bilgi.split("-");
                Kurs kurs=null;
                List<Kurs> eklenecek = new ArrayList<Kurs>();
                if(array[0].startsWith("#"))
                {
                	dizi = array[0].split("#");
                	id1 = Integer.valueOf(dizi[1]);
                	yas = Integer.valueOf(array[2]);
                	ad = array[1];
 
                }
                else
                {
                	
                	dizi = array[0].split("\\*");
                    id2 = Integer.valueOf(dizi[1]);
                    int kontrol = 0;
                	if(!kursiyerler.isEmpty())
                	{
                		for(Kursiyer k : kursiyerler)
                		{
                			if(k.getKursiyerId() == id1)
                			{   kontrol = 1;
                				kurs = new Kurs(id2, array[1]);
                				k.alinanKurslar.add(kurs);
                			}

                		}

                	}
                	if(kontrol == 0)
            		{
            			kurs = new Kurs(id2, array[1]);
                    	eklenecek.add(kurs);
                    	Kursiyer nesne = new Kursiyer(id1, ad, yas, eklenecek);
                        kursiyerler.add(nesne);
            		}
                }
                
            
            }
        }
		
		try(Scanner scan = new Scanner(new FileReader("kurs.txt")))
        {
            while(scan.hasNext())
            {
            	
                String bilgi = scan.nextLine();
                String[] array = bilgi.split("-");
                int k_id = Integer.valueOf(array[0]);
                Kurs nesne = new Kurs(k_id, array[1]);
                kurslar.add(nesne);     
              
            }
        }


		String kurs_ad = null, kursiyer_ad;
		int kurs_id = 0, kursiyer_id;
		String aranan;
		int aranan_id;
		
		double ucret = 0.0;
		
		
		Boolean dongu = true;
		while(dongu)
		{
			System.out.println("\t\t--------------------------------------");
			System.out.println("\t\t1) Kurs Ekle");
			System.out.println("\t\t2) Kurs Listeleme");
			System.out.println("\t\t3) Kursiyer Ekle");
			System.out.println("\t\t4) Kursiyer Arama");
			System.out.println("\t\t5) Kursiyer Silme");
			System.out.println("\t\t6) Kursiyer Listele");
			System.out.println("\t\t7) Kursiyer Ayrintili Listele");
			System.out.println("\t\t8) Kursiyerin Ödeyeceði Tutar Hesaplama");
			System.out.println("\t\t9) Cikis");
			System.out.println("\t\t--------------------------------------");
			System.out.println("Menu giriniz : ");
			menu = scanner.nextInt();
			
			switch(menu)
			{
			case 1:
				System.out.println("Eklemek istediginiz kurs id 'yi giriniz : ");
				kurs_id = scanner.nextInt();
				for(Kurs kurs : kurslar)
				{
					while(kurs.getKursId() == kurs_id)
					{
						System.out.println("\tBu id ile kurs bulunuyor!!");
						System.out.println("Lutfen eklemek istediginiz kurs id 'yi giriniz : ");
						kurs_id = scanner.nextInt();
					}
				}
				scanner.nextLine();
				System.out.println("Eklemek istediginiz kurs adini giriniz : ");
				kurs_ad = scanner.nextLine();
				Kurs kk = new Kurs(kurs_id, kurs_ad);
				kurslar.add(kk);
				break;
			case 2:
				System.out.println("----------------------------");
				System.out.println("KURS ID        KURS AD");
				System.out.println("--------       --------");
				for(Kurs k : kurslar)
				{
					System.out.println(k.getKursId() + "            " + k.getKursAd());
				}
				break;
			case 3:
				System.out.println("Kursiyer id giriniz : ");
				kursiyer_id = scanner.nextInt();
				for(Kursiyer k : kursiyerler)
				{
					while(k.getKursiyerId() == kursiyer_id)
					{
						System.out.println("\tBu id ile kursiyer bulunuyor!!");
						System.out.println("Lutfen eklemek istediginiz kursiyer id 'yi giriniz : ");
						kursiyer_id = scanner.nextInt();
					}
				}
				scanner.nextLine();
				System.out.println("Kursiyer ad soyad giriniz : ");
				kursiyer_ad = scanner.nextLine();
				System.out.println("Kursiyer yas giriniz : ");
				yas = scanner.nextInt();
				System.out.println("Kursiyerin kac adet kursu var ? : ");
				int kurs_sayi = scanner.nextInt();
				for(int i=0; i<kurs_sayi; i++)
				{
					scanner.nextLine();
					System.out.println("Eklemek istediginiz kurs adinin giriniz : ");
					kurs_ad = scanner.nextLine();
					System.out.println("Eklemek istediginiz kurs id giriniz : ");
					kurs_id = scanner.nextInt();
					Kurs k1 = new Kurs(kurs_id, kurs_ad);
					eklenecek2.add(k1);
				}
				
				Kursiyer k2 = new Kursiyer(kursiyer_id, kursiyer_ad, yas, eklenecek2);
				kursiyerler.add(k2);
				break;
			case 4:
				scanner.nextLine();
	            System.out.println("Aranacak kursiyer ad ve soyad giriniz : ");
	            aranan = scanner.nextLine();
	            int p=0;
	            for(Kursiyer k : kursiyerler)
	            {
	            	if(aranan.equals(k.getKursiyerAdSoyad()))
	            	{
	            		p=1;
	            		System.out.println("\tKURSIYER BULUNDU !!");
	            		System.out.println("Kursiyer ID : " + k.getKursiyerId() + " -- Kursiyer Ad Soyad : " + k.getKursiyerAdSoyad() + " -- Kursiyer Yas : " + k.getKursiyerYas());
	        			System.out.println("\tALDIGI KURSLAR");
	        			System.out.println("\t----------------");
	        			for(Kurs ku : k.alinanKurslar)
	        			{
	        				System.out.println("Kurs ID : " + ku.getKursId() + " -- Kurs Ad : " + ku.getKursAd());
	         
	        			}
	            	}
	            }
	            if(p==0)
	            {
	            	System.out.println("\tKURSIYER BULUNAMADI !!");
	            }
				break;
			case 5:
				System.out.println("Silinecek kursiyer id giriniz : ");
	            aranan_id = scanner.nextInt();
	            int y=0;
	            for(Kursiyer k : kursiyerler)
	            {
	            	if(aranan_id == (k.getKursiyerId()))
	            	{
	            		y=1;
	            		System.out.println("\tKULLANICI SILINDI !");
	            		kursiyerler.remove(k);
	            	}
	            }
	            if(y==0)
	            {
	            	System.out.println("\tSILINECEK KULLANICI BULUNAMADI !");
	            }
				break;
			case 6:
				for(Kursiyer k : kursiyerler)
	            {
	            	
	            	System.out.println("Kursiyer ID : " + k.getKursiyerId() + " -- Kursiyer Ad Soyad : " + k.getKursiyerAdSoyad() + " -- Kursiyer Yas : " + k.getKursiyerYas());
	            }
	            
				break;
			case 7:
				for(Kursiyer k : kursiyerler)
				{
					System.out.println("Kursiyer ID : " + k.getKursiyerId() + " -- Kursiyer Ad Soyad : " + k.getKursiyerAdSoyad() + " -- Kursiyer Yas : " + k.getKursiyerYas());
					System.out.println("\tALDIGI KURSLAR");
					System.out.println("\t----------------");
					for(Kurs ku : k.alinanKurslar)
					{
						System.out.println("Kurs ID : " + ku.getKursId() + " -- Kurs Ad : " + ku.getKursAd());
		 
					}
					System.out.println("---------------------------------------------------------------------------------------------");
				}
				break;
			case 8:
				System.out.println("Odeyecegi tutari hesaplamak istediginiz kursiyer id giriniz : ");
				aranan_id = scanner.nextInt();
				int s=0;
				ucret = 0.0;
				for(Kursiyer k : kursiyerler)
				{
					if(k.getKursiyerId() == aranan_id)
					{
						s=1;
						if(k.alinanKurslar.size() == 1)
						{
							ucret = 100.0 * 4;
						}
						else if(k.alinanKurslar.size() == 2)
						{
							ucret = (100.0 + (100.0 - (100.0 * ((double)15/100)))) * 4;
						}
						else if(k.alinanKurslar.size() == 3)
						{
							ucret = (2 * (100.0) + (100.0 - (100.0 * ((double)25/100)))) * 4;
						}
						else
						{
							ucret = (k.alinanKurslar.size() * (100.0 - (100.0 * ((double)10/100)))) * 4;
						}
					}
					
				}
				if(s==1)
					System.out.println(aranan_id + " id'ye sahip kursiyerin toplam kurs ucreti : " + ucret + " TL'dir.");
				else
					System.out.println("\tKURSIYER BULUNAMADI !!");
				break;
			case 9:
				File kursiyer_file = new File("kursiyer.txt");
				File kurs_file  = new File("kurs.txt");
				FileWriter fw_kursiyer = new FileWriter(kursiyer_file);  
				FileWriter fw_kurs = new FileWriter(kurs_file); 
				BufferedWriter bw_kursiyer = new BufferedWriter(fw_kursiyer);
				BufferedWriter bw_kurs = new BufferedWriter(fw_kurs);
				if(!kursiyer_file.exists())
				{
					kursiyer_file.createNewFile();
				}
				if(!kurs_file.exists())
				{
					kurs_file.createNewFile();
				}
				
				for(Kursiyer k : kursiyerler)
				{
					bw_kursiyer.write("#" + k.getKursiyerId() +  "-" + k.getKursiyerAdSoyad() + "-" + k.getKursiyerYas() + "\n");
					for(Kurs ku : k.alinanKurslar)
					{
						bw_kursiyer.write("*" + ku.getKursId() + "-" + ku.getKursAd() + "\n");
					}
				}
				for(Kurs ku : kurslar)
				{
					bw_kurs.write(ku.getKursId() + "-" + ku.getKursAd() + "\n");
				}
				
				bw_kursiyer.close();
				bw_kurs.close();
				System.out.println("CIKIS YAPILIYOR..");
				dongu = false;
				break;
			default:
				System.out.println("Gecersiz menu secimi. Lutfen tekrar menu seciniz..");
				break;
				
			}
		}

		
	}
}

// CLASS KURS


public class Kurs {
	private int kursId;
	private String kursAd;
	
	public Kurs(int kursId, String kursAd) {
		super();
		this.kursId = kursId;
		this.kursAd = kursAd;
	}

	public int getKursId() {
		return kursId;
	}

	public void setKursId(int kursId) {
		this.kursId = kursId;
	}

	public String getKursAd() {
		return kursAd;
	}

	public void setKursAd(String kursAd) {
		this.kursAd = kursAd;
	}
	
	

}

// CLASS KURSIYER

import java.util.*;

public class Kursiyer {
	private int kursiyerId;
	private String kursiyerAdSoyad;
	private int kursiyerYas;
	public List<Kurs> alinanKurslar;
	
	
	public Kursiyer(int kursiyerId, String kursiyerAdSoyad, int kursiyerYas, List<Kurs> alinanKurslar) {

		this.kursiyerId = kursiyerId;
		this.kursiyerAdSoyad = kursiyerAdSoyad;
		this.kursiyerYas = kursiyerYas;
		this.alinanKurslar = alinanKurslar;
	}
	

	public int getKursiyerId() {
		return kursiyerId;
	}
	public void setKursiyerId(int kursiyerId) {
		this.kursiyerId = kursiyerId;
	}
	public String getKursiyerAdSoyad() {
		return kursiyerAdSoyad;
	}
	public void setKursiyerAdSoyad(String kursiyerAdSoyad) {
		this.kursiyerAdSoyad = kursiyerAdSoyad;
	}
	public int getKursiyerYas() {
		return kursiyerYas;
	}
	public void setKursiyerYas(int kursiyerYas) {
		this.kursiyerYas = kursiyerYas;
	}
	
	

}

