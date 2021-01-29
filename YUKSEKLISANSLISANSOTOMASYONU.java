
// CLASS MAIN

public class Main {
	public static void main(String[] args)
	{
		Ogrenci ogr = new Ogrenci("Hediye", "Orhan");
		YuksekLisansOgrencisi yogr = new YuksekLisansOgrencisi("Hediye", "Orhan", "Tez", 65);
		LisansOgrencisi logr = new LisansOgrencisi("Hediye", "Orhan", 2, 90, 75);
		
		Ogrenci ogr1 = new Ogrenci("Elif", "Orhan");
		YuksekLisansOgrencisi yogr1 = new YuksekLisansOgrencisi("Elif", "Orhan", "Ders", 85);
		LisansOgrencisi logr1 = new LisansOgrencisi("Elif", "Orhan", 3, 40, 85);
		
		System.out.println("\n---------------------------\n");
		System.out.println("\n -- Ogrenci -- \n");
		ogr.bilgileriYazdir();
		ogr1.bilgileriYazdir();
		
		System.out.println("\n---------------------------\n");
		System.out.println("\n -- YuksekLisansOgrencisi -- \n");
		yogr.HarfHesapla();
		System.out.println(" ");
		yogr.MezuniyetYiliHesapla();
		System.out.println(" ");
		yogr.bilgileriYazdir();
		
		yogr1.HarfHesapla();
		System.out.println(" ");
		yogr1.MezuniyetYiliHesapla();
		System.out.println(" ");
		yogr1.bilgileriYazdir();
		
		
		System.out.println("\n---------------------------\n");
		System.out.println("\n -- LisansOgrencisi -- \n");
		logr.GecmeNotuHesapla();
		System.out.println(" ");
		logr.MezuniyetYiliHesapla();
		System.out.println(" ");
		logr.bilgileriYazdir();
		
		logr1.GecmeNotuHesapla();
		System.out.println(" ");
		logr1.MezuniyetYiliHesapla();
		System.out.println(" ");
		logr1.bilgileriYazdir();
		
	}

}

// CLASS OGRENCI

public class Ogrenci {
	private int id;
	private static int sayac = 0;
	public String ad;
	public String soyad;

	public Ogrenci(String ad, String soyad) {
		super();
		this.id = sayac++;
		this.ad = ad;
		this.soyad = soyad;
	}

	public void bilgileriYazdir() {
		System.out.println("Ogrenci id : " + id);
		System.out.println("Ogrenci ad : " + ad);
		System.out.println("Ogrenci soyad : " + soyad);
	}
}

// CLASS YUKSEKLISANSOGRENCISI
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Date;
public class YuksekLisansOgrencisi extends Ogrenci {

	private int id;
	private static int sayac = 0;
	public String asama;
	public int final_notu;

	public YuksekLisansOgrencisi(String ad, String soyad, String asama, int final_notu) {
		super(ad, soyad);
		this.id = sayac++;
		this.asama = asama;
		this.final_notu = final_notu;

	}

	@Override
	public void bilgileriYazdir() {
		System.out.println("Ogrenci id : " + id);
		System.out.println("Ogrenci ad : " + ad);
		System.out.println("Ogrenci soyad : " + soyad);
		System.out.println("Ogrenci asama : " + asama);
		System.out.println("Ogrenci final : " + final_notu);
	}
	
	public void HarfHesapla()
	{
		if (final_notu >= 90) {
            System.out.println("Harf notu AA");
        }
        else if (final_notu >= 85) {
        	System.out.println("Harf notu BA");
            
        }
        else if (final_notu >= 80) {
        	System.out.println("Harf notu BB");
            
        }
        else if (final_notu >= 75) {
        	System.out.println("Harf notu CB");
            
        }
        else if (final_notu >= 70) {
        	System.out.println("Harf notu CC");
            
        }
        else if (final_notu >= 65) {
        	System.out.println("Harf notu DC");
            
        }
        else if (final_notu >= 60) {
        	System.out.println("Harf notu DD");
            
        }
        else if (final_notu >= 55) {
        	System.out.println("Harf notu FD");
            
        }
        else {
        	System.out.println("Harf notu FF. Kaldiniz !!");
        }
	}
	
	public void MezuniyetYiliHesapla()
	{
		int yil = 0;
		Calendar takvim = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		
		//System.out.println("YİL : " + sdf.format(takvim.getTime()));
        
		if(asama.equals("Tez"))
		{
			yil = 0;
		}
		else
			yil = 1;
		
		System.out.println("Ogrenci id : " + id);
		System.out.println("Ogrenci ad : " + ad);
		System.out.println("Ogrenci soyad : " + soyad);
		System.out.println("Yaklasik mezuniyet tarihi : " + (Integer.valueOf(sdf.format(takvim.getTime())) + yil));
	}
}

// CLASS LISANSOGRENCISI

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LisansOgrencisi extends Ogrenci {

	private int id;
	private static int sayac = 0;
	public int sinif;
	public int vize;
	public int final_notu;

	public LisansOgrencisi(String ad, String soyad, int sinif, int vize, int final_notu) {
		super(ad, soyad);
		this.id = sayac++;
		this.sinif = sinif;
		this.vize = vize;
		this.final_notu = final_notu;
	}

	@Override
	public void bilgileriYazdir() {
		System.out.println("Ogrenci id : " + id);
		System.out.println("Ogrenci ad : " + ad);
		System.out.println("Ogrenci soyad : " + soyad);
		System.out.println("Ogrenci sinif : " + sinif);
		System.out.println("Ogrenci vize : " + vize);
		System.out.println("Ogrenci final : " + final_notu);
	}

	public void GecmeNotuHesapla() {
		double gn;
		gn = (vize * 0.4) + (final_notu * 0.6);
		System.out.println("Ogrenci id : " + id);
		System.out.println("Ogrenci ad : " + ad);
		System.out.println("Ogrenci soyad : " + soyad);
		System.out.println("Ogrenci gecme notu : " + gn);
	}

	public void MezuniyetYiliHesapla() {

		Calendar takvim = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		
		//System.out.println("YİL : " + sdf.format(takvim.getTime()));
		int yil = Integer.valueOf(sdf.format(takvim.getTime()));
	
		int kalan = 4 - sinif;
		System.out.println("Ogrenci id : " + id);
		System.out.println("Ogrenci ad : " + ad);
		System.out.println("Ogrenci soyad : " + soyad);
		System.out.println("Ogrencinin mezuniyet yili : " + (yil + kalan));
	}
}

