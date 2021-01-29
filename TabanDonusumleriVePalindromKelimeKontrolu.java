import java.util.Scanner;

public class uygulama {
	public static void main(String[] args)
	{
		// Palindrom kelime kontrolu
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Kelime giriniz : ");
		String kelime = scanner.nextLine();
   
		String kontrol="";
		
		for(int i=kelime.length()-1; i>=0; i--)
		{
			kontrol += kelime.charAt(i);	
		}
	
		if(kontrol.equals(kelime))
		{
			System.out.println("Polindrom.");
		}
		else
		{
			System.out.println("Polindrom degil !!");
		}
		
		 */
		
		// 10'luk tabandan 2'lik tabana donusum
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Sayi giriniz : ");
		
		int sayi = scanner.nextInt();
		int kalan=0;
		String deger ="";
		String sonuc = "";
		int sayi_yedek = sayi;
		
		while(sayi > 0)
		{
			kalan = sayi%2;
			deger +=kalan;
			sayi /= 2;
			
		}

       for(int j=deger.length()-1; j>=0; j--)
       {
    	   sonuc += deger.charAt(j);
       }
       
	    
       System.out.println(sayi_yedek + " sayisinin 2'lik tabandaki degeri : " + sonuc);
		
		*/
		
	  // 10'luk taban 8'lik tabana donusum
		/*
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Sayi giriniz : ");
		
		int sayi = scanner.nextInt();
		int kalan=0;
		String deger ="";
		String sonuc = "";
		int sayi_yedek = sayi;
		
		while(sayi > 0)
		{
			kalan = sayi%8;
			deger +=kalan;
			sayi /= 8;
			
		}

       for(int j=deger.length()-1; j>=0; j--)
       {
    	   sonuc += deger.charAt(j);
       }
       
	    
       System.out.println(sayi_yedek + " sayisinin 8'lik tabandaki degeri : " + sonuc);
		*/
		
	// 10'luk taban 16'lik tabana donusum
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Sayi giriniz : ");
		
		int sayi = scanner.nextInt();
		int kalan=0;
		String deger ="";
		String sonuc = "";
		int sayi_yedek = sayi;
		
		while(sayi > 0)
		{
			kalan = sayi%16;
			if(kalan == 10)
			{
				deger += "A";
			}
			else if(kalan == 11)
			{
				deger += "B";
			}
			else if(kalan == 12)
			{
				deger += "C";
			}
			else if(kalan == 13)
			{
				deger += "D";
			}
			else if(kalan == 14)
			{
				deger += "E";
			}
			else if(kalan == 15)
			{
				deger += "F";
			}
			else
			{
				deger +=kalan;
			}
		
			sayi /= 16;
			
		}

       for(int j=deger.length()-1; j>=0; j--)
       {
    	   sonuc += deger.charAt(j);
       }
       
	    
       System.out.println(sayi_yedek + " sayisinin 16'lik tabandaki degeri : " + sonuc);
	}
	
	*/
		
		// Tum donusumlerin birlikte yapildigi kod.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Sayi giriniz : ");
		
		int sayi = scanner.nextInt();
		int kalan=0;
		
		String deger ="";
		String sonuc = "";
		
		int sayi_yedek = sayi;
		while(sayi > 0)
		{
			kalan = sayi%2;
			deger +=kalan;
			sayi /= 2;
			
		}
		
		for(int j=deger.length()-1; j>=0; j--)
	    {
			sonuc += deger.charAt(j);
	    }
		
	  System.out.println(sayi_yedek + " sayisinin 8'lik tabandaki degeri : " + sonuc);
	  
	  sayi  = sayi_yedek;
	  deger = "";
	  sonuc = "";
	
	  
	  while(sayi > 0)
		{
			kalan = sayi%8;
			deger +=kalan;
			sayi /= 8;
			
		}

     for(int j=deger.length()-1; j>=0; j--)
     {
  	   sonuc += deger.charAt(j);
     }
     
	    
     System.out.println(sayi_yedek + " sayisinin 8'lik tabandaki degeri : " + sonuc);
     
     sayi = sayi_yedek;
     deger = "";
	 sonuc = "";
 
     
     while(sayi > 0)
		{
			kalan = sayi%16;
			if(kalan == 10)
			{
				deger += "A";
			}
			else if(kalan == 11)
			{
				deger += "B";
			}
			else if(kalan == 12)
			{
				deger += "C";
			}
			else if(kalan == 13)
			{
				deger += "D";
			}
			else if(kalan == 14)
			{
				deger += "E";
			}
			else if(kalan == 15)
			{
				deger += "F";
			}
			else
			{
				deger +=kalan;
			}
		
			sayi /= 16;
			
		}

    for(int j=deger.length()-1; j>=0; j--)
    {
 	   sonuc += deger.charAt(j);
    }
    
	    
    System.out.println(sayi_yedek + " sayisinin 16'lik tabandaki degeri : " + sonuc);
		
	}

}
