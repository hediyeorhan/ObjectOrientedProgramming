
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
