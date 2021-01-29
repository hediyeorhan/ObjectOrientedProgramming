
public class Main {
	public static void main(String[] args)
	{
		
		System.out.println("Basamak sayisi : " + Basamak(346521));
		System.out.println("2^5 : " + Power(2, 5));
		System.out.println("5! : " + Faktoriyel(5));
	}
	
	public static int Basamak(int n)
	{
		if(n>-10 && n<10)
		{
			return 1;
		}
		return  1 + Basamak(n/10);
	}
	
	public static int Power(int k, int n)
	{
		if(n==0)
			return 1;
		else
			return k * Power(k, n-1);
	}
	
	public static int Faktoriyel(int n)
	{
		if(n==0)
			return 1;
		else
			return n * Faktoriyel(n-1);
	}

}


// RECURSIVE METHOD 2


public class Recursive {
	public static void main(String[]  args)
	{
		System.out.println("1 ile 7 arasi tek sayilarin carpimi : " + carpim(7));
		System.out.println("1 ile 10 arasi tek sayilarin carpimi : " + carpim(10));
		System.out.println("\n---------------------------------------------------------\n");
		System.out.println("1 ile 7 arasi tek sayilarin toplami : " + toplam(7));
		System.out.println("1 ile 10 arasi tek sayilarin toplami : " + toplam(10));
	}
	
	public static int carpim(int n)
	{
		if(n < 0)
		{
			return 1;
		}
		if(n % 2 != 0)
		{
			return n * carpim(n-1);
		}
		return carpim(n-1);
			
	}
	
	public static int toplam(int n)
	{
		if(n < 0)
		{
			return 0;
		}
		if(n % 2 != 0)
		{
			return n + toplam(n-1);
		}
		return toplam(n-1);
			
	}

}
 // RECURSIVE METHOD 3

public class Recursive {
	public static void main(String[]  args)
	{
		System.out.println("Tekrar sayisi : " + Say7(77477, 0));
	}
	
	public static int Say7(int n, int sayac)
	{
		if(n <= 0)
			return sayac;
		if(n-((n/10)*10) == 7)
		{
			sayac = sayac + 1;
		}
		return Say7(n/10, sayac);	
	}
}
