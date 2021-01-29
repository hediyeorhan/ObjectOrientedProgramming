import java.util.Scanner;

public class main {
	public static void main(String[] args)
	{
		System.out.println("Tırnak sayisi : " + MaxTirnak("mer\"h\"a\"b\"\"a\"\"\""));
	}
	
	public static int MaxTirnak(String input)
	{
		int tut = 0;
		int sayac = 0;
		for(int i=0; i<input.length()-1; i++)
		{
			if(input.charAt(i) == '"' && input.charAt(i+1) == '"')
			{
				sayac ++;
			}
			else
			{
				if(sayac >= tut)
				{
					tut = sayac;
				}
	            
			}
				
		}
		
		return tut;
	}


}
