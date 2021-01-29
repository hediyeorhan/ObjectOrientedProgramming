/*import java.util.Scanner;

public class Anasayfa_1887 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int matsayi;
		int ressayi;
		
		String ad, soyad;
		int yas, gs;
		
		System.out.println("Matematik ogretmenleri sayisini giriniz : ");
		matsayi = scanner.nextInt();
		Ogretmen_1887[] matematik = new MatematikOgretmeni_1887[matsayi];
		
		for(int i=0; i<matsayi; i++)
		{
			System.out.print("(Matematik) Ogretmen adi giriniz : ");
			ad = scanner.next();
			System.out.print("(Matematik) Ogretmen soyadi giriniz : ");
			soyad = scanner.next();
			System.out.print("(Matematik) Ogretmen yasi giriniz : ");
			yas = scanner.nextInt();
			System.out.print("(Matematik) Ogretmen gorev suresi giriniz : ");
			gs = scanner.nextInt();
			
			matematik[i] = new MatematikOgretmeni_1887(ad, soyad, yas, gs);
		}
		
		System.out.println("\n---------------------------------\n");
		System.out.println("Resim ogretmenleri sayisini giriniz : ");
		ressayi = scanner.nextInt();
		
		
		Ogretmen_1887[] resim = new ResimOgretmeni_1887[ressayi];
		
		
		for(int j=0; j<ressayi; j++)
		{
			System.out.print("(Resim) Ogretmen adi giriniz : ");
			ad = scanner.next();
			System.out.print("(Resim) Ogretmen soyadi giriniz : ");
			soyad = scanner.next();
			System.out.print("(Resim) Ogretmen yasi giriniz : ");
			yas = scanner.nextInt();
			System.out.print("(Resim) Ogretmen gorev suresi giriniz : ");
			gs = scanner.nextInt();
			
			resim[j] = new ResimOgretmeni_1887(ad, soyad, yas, gs);
		}
		
		Ogretmen_1887.OgretmenSayisiVer();
		
		System.out.println("\nMATEMATIK OGRENCILERI\n");
		System.out.println("---------------------------");
		for(int i=0; i<matsayi; i++)
		{
			matematik[i].BilgileriYazdir();
		}
		System.out.println("\nRESIM OGRENCILERI\n");
		System.out.println("---------------------------");
		for(int j=0; j<ressayi; j++)
		{
			resim[j].BilgileriYazdir();
		}
		
		System.out.println("\n\n-------- SIRALI OGRETMEN LISTELERI --------\n");
		
		System.out.println("\nMATEMATIK OGRENCILERI\n");
		System.out.println("---------------------------");
		for(int i=0; i<matsayi; i++)
		{
			matematik[i].BilgileriYazdir();
		}
		System.out.println("\nRESIM OGRENCILERI\n");
		System.out.println("---------------------------");
		for(int j=0; j<ressayi; j++)
		{
			resim[j].BilgileriYazdir();
		}
	}
	
	public void OgretmenSirala(MatematikOgretmeni_1887[] matematik)
	{
		MatematikOgretmeni_1887 temp;
		double tp1, tp2;
		
		for(int i=0; i<matematik.length; i++)
		{
			for(int j=0; j<matematik.length-1; j++)
			{
				tp1 = matematik[i].tp;
				tp2=matematik[j+1].tp;
				
				if(tp1 > tp2)
				{
					temp = matematik[j];
					matematik[j] = matematik[j+1];
					matematik[j+1] = temp;
				}
			}
		}
	}
	
	public void OgretmenSirala(ResimOgretmeni_1887[] resim)
	{
		ResimOgretmeni_1887 temp;
		double tp1, tp2;
		
		for(int i=0; i<resim.length; i++)
		{
			for(int j=0; j<resim.length-1; j++)
			{
				tp1 = resim[i].tp;
				tp2 = resim[j+1].tp;
				
				if(tp1 > tp2)
				{
					temp = resim[j];
					resim[j] = resim[j+1];
					resim[j+1] = temp;
				}
			}
		}
	}

}

public class Ogretmen_1887 {
	public String ad;
	public String soyad;
	public int yas;
	public String brans;
	private static int ogretmen_sayisi;
	private static int sayac=0;
	
	public Ogretmen_1887(String ad, String soyad, int yas) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		this.ogretmen_sayisi = sayac++;
	}
	
	public void BilgileriYazdir()
	{
		System.out.println("Ogretmen Ad : " + ad);
		System.out.println("Ogretmen Soyad : " + soyad);
		System.out.println("Ogretmen Yas : " + yas);
		System.out.println("Ogretmen Brans : " + brans);
	}
	
	public final static void OgretmenSayisiVer()
	{
		System.out.println("\n---------------------------------------\n");
		System.out.println("Toplam ogretmen sayisi : " + ogretmen_sayisi);
		System.out.println("\n---------------------------------------\n");
	}
	
	

}

public class MatematikOgretmeni_1887 extends Ogretmen_1887{
	
	private int id;
	public int gs;
	public double tp;
	private static int sayac = 0;
	
	public MatematikOgretmeni_1887(String ad, String soyad, int yas, int gs) {
		super(ad, soyad, yas);
		this.gs = gs;
		this.tp = (double)gs * 0.4;
		super.brans = "Matematik";
		this.id = sayac++;

	}


	public void BilgileriYazdir() {
		
		System.out.println("Ogretmen id : " + id);
		System.out.println("Ogretmen Ad : " + ad);
		System.out.println("Ogretmen Soyad : " + soyad);
		System.out.println("Ogretmen Yas : " + yas);
		System.out.println("Ogretmen Brans : " + brans);
		System.out.println("TP : " + tp);
		System.out.println("MatematikOgretmeni_1887 sinifinin nesnesi");
	}
	

}
public class ResimOgretmeni_1887 extends Ogretmen_1887{
	
	private int id;
	public int gs;
	public double tp;
	private static int sayac=0;
	
	public ResimOgretmeni_1887(String ad, String soyad, int yas, int gs) {
		super(ad, soyad, yas);
	    this.id = sayac++;
	    this.gs = gs;
	    this.tp = (double)gs * 0.3;
	    super.brans = "Resim";
	}
	
    public void BilgileriYazdir() {
		
		System.out.println("Ogretmen id : " + id);
		System.out.println("Ogretmen Ad : " + ad);
		System.out.println("Ogretmen Soyad : " + soyad);
		System.out.println("Ogretmen Yas : " + yas);
		System.out.println("Ogretmen Brans : " + brans);
		System.out.println("TP : " + tp);
		System.out.println("ResimOgretmeni_1887 sinifinin nesnesi");
	}

}*/