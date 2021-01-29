// CLASS MAIN
package Hazirlik4;

import java.util.Scanner;

import Hazirlik2.Dersler;

public class Main {
	public static void main(String[]  args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int toplam, bs, ms, es, yas;
		String ad;
		
		System.out.println("Kac adet bilgisayar muhendisi gireceksiniz : ");
		bs = scanner.nextInt();
		
		System.out.println("Kac adet elektrik muhendisi gireceksiniz : ");
		es = scanner.nextInt();
		
		System.out.println("Kac adet makine muhendisi gireceksiniz : ");
		ms = scanner.nextInt();
        
		toplam = bs + es + ms;
		
		Muhendis[] muhendisler = new Muhendis[toplam];
		
		System.out.println("\n -- Bilgisayar muhendisinin bilgilerini giriniz -- \n");
		for(int i=0; i<bs; i++)
		{
			System.out.println("BM Ad giriniz : ");
			ad = scanner.next();
			
			System.out.println("BM Yas giriniz : ");
			yas = scanner.nextInt();
			
			muhendisler[i] = new BM(ad, yas);
		}
		
		System.out.println("\n -- Elektrik muhendisinin bilgilerini giriniz -- \n");
		for(int i=bs; i<bs+es; i++)
		{
			System.out.println("EM Ad giriniz : ");
			ad = scanner.next();
			
			System.out.println("EM Yas giriniz : ");
			yas = scanner.nextInt();
			
			muhendisler[i] = new EM(ad, yas);
		}
		
		System.out.println("\n -- Makine muhendisinin bilgilerini giriniz -- \n");
		for(int i=bs+es; i<toplam; i++)
		{
			System.out.println("MM Ad giriniz : ");
			ad = scanner.next();
			
			System.out.println("MM Yas giriniz : ");
			yas = scanner.nextInt();
			
			muhendisler[i] = new MM(ad, yas);
		}
		
		
		BilgileriYazdir(muhendisler);
		
		PuanHesapla(muhendisler);
		
		PuanaGoreSirala(muhendisler);
		
		System.out.println("\n\n\t ******* SIRALI MUHENDISLER *******");
		BilgileriYazdir(muhendisler);
	}

	private static void PuanaGoreSirala(Muhendis[] muhendisler) {
		Muhendis temp;
		int p1, p2;
		// buyukten - kucuge
		for(int i=0; i<muhendisler.length; i++)
		{
			for(int j=0; j<muhendisler.length-1; j++)
			{
				p1 = muhendisler[j].PuanHesapla();
				p2 = muhendisler[j+1].PuanHesapla();
				
				if(p2 > p1)
				{
					temp = muhendisler[j];
					muhendisler[j] = muhendisler[j+1];
					muhendisler[j+1] = temp;
				}
			}
		}
		
	}

	private static void PuanHesapla(Muhendis[] muhendisler) {
		for(int i=0; i<muhendisler.length; i++)
		{
			System.out.println((i+1) + ". Muhendis Ad : " + muhendisler[i].ad + " -- Puan : " + muhendisler[i].PuanHesapla());
		}
		
	}

	private static void BilgileriYazdir(Muhendis[] muhendisler) {
		for(int i=0; i<muhendisler.length; i++)
		{
			muhendisler[i].BilgileriYazdir();
		}
		
	}

}

// ABSTRACT CLASS MUHENDIS

package Hazirlik4;

public abstract class Muhendis {
	
	public String ad, brans;
	public int yas, puan;
	
	
	public Muhendis(String ad, int yas) {
		this.ad = ad;
		this.yas = yas;
		this.brans = "Muhendis";
	}
	
	public void BilgileriYazdir()
	{
		System.out.println("\n\t -- MUHENDIS SINIFI -- \n");
		System.out.println("AD : " + ad);
		System.out.println("Brans : " + brans);
		System.out.println("Yas : " + yas);
		System.out.println("Puan : " + PuanHesapla());
	}

	public abstract int PuanHesapla();
	
	

}

// CLASS MM
package Hazirlik4;

public class MM extends Muhendis{

	public MM(String ad, int yas) {
		super(ad, yas);
		this.brans = "Makine Muhendisi";
	}
	
	public void BilgileriYazdir()
	{
		System.out.println("\n\t -- MAKINE MUHENDISI SINIFI -- \n");
		System.out.println("AD : " + ad);
		System.out.println("Brans : " + brans);
		System.out.println("Yas : " + yas);
		System.out.println("Puan : " + PuanHesapla());
	}
	
	public int PuanHesapla() {
		return this.yas * 3;
	}


}

// CLASS EM 
package Hazirlik4;

public class EM extends Muhendis{

	public EM(String ad, int yas) {
		super(ad, yas);
		this.brans = "Elektrik Muhendisi";
	}

	public void BilgileriYazdir()
	{
		System.out.println("\n\t -- ELEKTRIK MUHENDISI SINIFI -- \n");
		System.out.println("AD : " + ad);
		System.out.println("Brans : " + brans);
		System.out.println("Yas : " + yas);
		System.out.println("Puan : " + PuanHesapla());
	}

	public int PuanHesapla() {
		return this.yas * 5;
	}
}

// CLASS BM
package Hazirlik4;

public class BM extends Muhendis{

	public BM(String ad, int yas) {
		super(ad, yas);
		this.brans = "Bilgisayar Muhendisi";
	}
	
	public void BilgileriYazdir()
	{
		System.out.println("\n\t -- BILGISAYAR MUHENDISI SINIFI -- \n");
		System.out.println("AD : " + ad);
		System.out.println("Brans : " + brans);
		System.out.println("Yas : " + yas);
		System.out.println("Puan : " + PuanHesapla());
	}

	public int PuanHesapla() {
		return this.yas * 4;
	}

}
