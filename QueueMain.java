package ArrayListGeneric;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QueueMain {

	
	// Kuyruk yapisi hatali calisiyor.. LinkedList!ten turetince hata gitti.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String ad, soyad;
		int vize_not, final_not, menu;
		
		boolean dongu = true;
		
		
		Queue<Ogrenci> liste = new LinkedList<Ogrenci>();

		
		while(dongu)
		{
			System.out.println("\t\t----------------------------");
			System.out.println("\t\t1) Ogrenci Ekle");
			System.out.println("\t\t2) Ogrencileri Listele");
			System.out.println("\t\t3) Ad Ara");
			System.out.println("\t\t4) Ad Sil");
			System.out.println("\t\t5) Cikis");
			System.out.println("\t\t----------------------------");
			System.out.println("Menu giriniz : ");
			menu = scanner.nextInt();
			
			switch(menu)
			{
			case 1:
				System.out.println("Ogrenci ad giriniz : ");
				ad = scanner.next();
				System.out.println("Ogrenci soyad giriniz : ");
				soyad = scanner.next();
				System.out.println("Ogrenci vize notu giriniz : ");
				vize_not = scanner.nextInt();
				System.out.println("Ogrenci final notu giriniz : ");
				final_not = scanner.nextInt();
				Ogrenci ogr = new Ogrenci(ad, soyad, vize_not, final_not);
				liste.add(ogr);
				break;
			case 2:
				System.out.println(" -- Ogrenci Bilgileri -- ");
				for(Ogrenci ogrenci : liste)
				{
					System.out.println("NO : " + ogrenci.getNo() +" AD : " + ogrenci.getAd() + " SOYAD : " + ogrenci.getSoyad() + " GECME NOTU : " + ogrenci.getGecme_notu());
				}
				break;
			case 3:
				String aranacak;
				System.out.println("Aramak istediginiz ogrencinin adini giriniz : ");
				aranacak = scanner.next();
				int count = 0;
				for(Ogrenci ogrenci : liste)
				{
					if(ogrenci.getAd().equals(aranacak))
					{
						count++;
						System.out.println("Aranan ogrenci bulundu !!");
						System.out.println("NO : " + ogrenci.getNo() +" AD : " + ogrenci.getAd() + " SOYAD : " + ogrenci.getSoyad() + " GECME NOTU : " + ogrenci.getGecme_notu());
					}
				}
				if(count == 0)
				{
					System.out.println("Aranan ogrenci bulunamadý !!");
				}
				break;
			case 4:
				String silinecek;
				int indis = 0;
				System.out.println("Silmek istediginiz ogrencinin adini giriniz : ");
				silinecek = scanner.next();
				for(Ogrenci ogrenci : liste)
				{   
					if(ogrenci.getAd().equals(silinecek))
					{
						liste.remove(indis);
					}
					indis++;
				}
				break;
			case 5:
				System.out.println("Cikis yapiliyor ..");
				dongu = false;
				break;
			default:
				System.out.println("Gecersiz menu secimi. Lutfen tekrar menu seciniz..");
				break;
				
			}
		}


	}

}
