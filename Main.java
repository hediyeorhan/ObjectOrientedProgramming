
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
