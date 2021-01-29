// CLASS MAIN
package Ornek2;

public class Main {

	public static void main(String[] args) {
	
		IkiBasamakliSayi sayi1 = new IkiBasamakliSayi(45);
		
		sayi1.SayiBilgisi();
		
		Sayi sayi2 = new Sayi(65);
		
		System.out.println("\n----------\n");
		sayi2.SayiBilgisi();
		

	}

}
// INTERFACE SAYIBASAMAKLARIBUL
package Ornek2;

public interface SayiBasamaklariBul {
	public abstract int[] SayiBaBul();
	

}

// CLASS SAYI

package Ornek2;

public class Sayi extends Sayilar{
	

	public Sayi(int sayi) {
		super(sayi);
	}

	@Override
	public int Topla() {
		int[] dizi = SayiBaBul();
		int toplam = 0;
		for(int i=0; i<dizi.length; i++)
		{
			toplam += dizi[i];
		}
		return toplam;
	}

	@Override
	public int[] SayiBaBul() {
	   int bs = Basamak(sayi);
       int[] dizi = new int[bs];
       
       int kalan;
       int sayac = 0;
       while(sayi > 0)
       {
    	   kalan = sayi % 10;
    	   sayi = sayi / 10;
    	   dizi[sayac] = kalan;
    	   sayac++;
       }
       
       return dizi;
	}

	@Override
	public void SayiBilgisi() {
		int toplam = Topla();
		
		System.out.println("\nBu bir iki basamakli sayidir..");
		
		System.out.println("Basamak degerleri toplami : " + toplam);
        
	
	}
	
	
	public int Basamak(int n)
	{
		if(n>-10 && n<10)
		{
			return 1;
		}
		return  1 + Basamak(n/10);
	}

}


// CLASS IKIBASAMAKLISAYI
package Ornek2;

public class IkiBasamakliSayi extends Sayilar{
	
	public int bs;
	
	public IkiBasamakliSayi(int sayi) {
		super(sayi);
		this.bs = 2;
	}

	@Override
	public int Topla() {
		int[] dizi = SayiBaBul();
		int toplam = 0;
		for(int i=0; i<dizi.length; i++)
		{
			toplam += dizi[i];
		}
		return toplam;
	}

	@Override
	public int[] SayiBaBul() {
       int[] dizi = new int[bs];
       
       int kalan;
       int sayac = 0;
       while(sayi > 0)
       {
    	   kalan = sayi % 10;
    	   sayi = sayi / 10;
    	   dizi[sayac] = kalan;
    	   sayac++;
       }
       
       return dizi;
	}

	@Override
	public void SayiBilgisi() {
		int toplam = Topla();
		
		System.out.println("\nBu bir iki basamakli sayidir..");
		
		System.out.println("Basamak degerleri toplami : " + toplam);
        
	
	}

	
	

}

 // ABSTRACT CLASS SAYILAR
package Ornek2;

public abstract class Sayilar implements BasamakToplamiHesapla{
	public int sayi;
	
	public Sayilar(int sayi)
	{
		this.sayi = sayi;
	}
	
	public abstract void SayiBilgisi();

}

// INTERFACE BASAMAKTOPLAMIHESAPLA
package Ornek2;

public interface BasamakToplamiHesapla extends SayiBasamaklariBul{
	public abstract int Topla();

}
