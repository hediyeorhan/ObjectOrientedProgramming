// CLASS OGRENCI

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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		String ad, soyad;
		int vize_not, final_not, menu;
		
		boolean dongu = true;
		
		
		ArrayList<Ogrenci> liste = new ArrayList<Ogrenci>();
		
		while(dongu)
		{
			System.out.println("\t\t----------------------------");
			System.out.println("\t\t1) Ogrenci Ekle");
			System.out.println("\t\t2) Ogrencileri Listele");
			System.out.println("\t\t3) Ad Ara");
			System.out.println("\t\t4) Numara Ara");
			System.out.println("\t\t5) GecmeNotu 70-80 Ara");
			System.out.println("\t\t6) Ad Sil");
			System.out.println("\t\t7) Numara Sil");
			System.out.println("\t\t8) GecmeNotu 70-80 Sil");
			System.out.println("\t\t9) Cikis");
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
				int ara;
				System.out.println("Aranacak no giriniz : ");
				ara = scanner.nextInt();
				int sayac = 0;
				for(Ogrenci ogrenci : liste)
				{
					sayac++;
					if(ogrenci.getNo() == ara)
					{
						System.out.println("Aranacak ogrenci bulundu !!");
						System.out.println("NO : " + ogrenci.getNo() +" AD : " + ogrenci.getAd() + " SOYAD : " + ogrenci.getSoyad() + " GECME NOTU : " + ogrenci.getGecme_notu());
					}
					
				}
				if(sayac == 0)
				{
					System.out.println("Aranan ogrenci bulunamadi !!");
				}
				break;
			case 5:
				System.out.println(" -- GecmeNotu 70-80 arasi olan ogrenciler --");
				int say = 0;
				for(Ogrenci ogrenci : liste)
				{
					if(ogrenci.getGecme_notu()<80 && ogrenci.getGecme_notu()>70)
					{
						say++;
						System.out.println("NO : " + ogrenci.getNo() +" AD : " + ogrenci.getAd() + " SOYAD : " + ogrenci.getSoyad() + " GECME NOTU : " + ogrenci.getGecme_notu());
					}
				}
				if(say == 0)
				{
					System.out.println("GecmeNotu 70-80 arasi ogrenci bulunamadý !!");
				}
				break;
			case 6:
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
			case 7:
				int sil_no;
				int indeks = 0;
				System.out.println("Silmek istediginiz ogrencinin no'sunu giriniz : ");
				sil_no = scanner.nextInt();
				for(Ogrenci ogrenci : liste)
				{   
					if(ogrenci.getNo() == sil_no)
					{
						liste.remove(indeks);
					}
					indeks++;
				}
				break;
			case 8:
				for(Ogrenci ogrenci : liste)
				{
					if(ogrenci.getGecme_notu()<80 && ogrenci.getGecme_notu()>70)
					{
						liste.remove(ogrenci);
					}
				
				}
				break;
			case 9:
				
				File file = new File("bilgiler.txt");
				FileWriter fw = new FileWriter(file, true);  // true parametresi ile silmeden dosya ustune ekleme yaptik
				BufferedWriter bw = new BufferedWriter(fw);
				
				if(!file.exists())
				{
					file.createNewFile();
				}
				
				for(Ogrenci ogrenci : liste)
				{
					bw.write(ogrenci.getNo() + " " + ogrenci.getAd() + " " + ogrenci.getSoyad() + "\n");
				}
				
				bw.close();
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
