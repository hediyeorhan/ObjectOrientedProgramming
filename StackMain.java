// CLASS OGRENCİ
package ArrayListGeneric;

public class Ogrenci {
	private int no;
	private String ad;
	private String soyad;
	private int vize_not;
	private int final_not;
	private double gecme_notu;
	private static int count = 0;
	
	
	public Ogrenci(String ad, String soyad, int vize_not, int final_not) {
		this.no = ++count;
		this.ad = ad;
		this.soyad = soyad;
		this.vize_not = vize_not;
		this.final_not = final_not;
		this.gecme_notu = ((vize_not * 0.4) + (final_not * 0.6));
	}
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public double getGecme_notu() {
		return gecme_notu;
	}
	public void setGecme_notu(double gecme_notu) {
		this.gecme_notu = gecme_notu;
	}
	
	
	

}

// CLASS MAIN

package ArrayListGeneric;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class StackMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String ad = null, soyad;
		int vize_not, final_not, menu;
		
		boolean dongu = true;
		
		
		Stack<Ogrenci> liste = new Stack<Ogrenci>();
		
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
				liste.push(ogr);
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
