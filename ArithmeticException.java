import java.util.Random;

public class Main {
	public static void main(String[] args)
	{
		
		Random r = new Random();
		
		int a = 0, b =0, c = 0;
		

		for(int i=0; i<12000; i++)
		{
			try
			{
				b = r.nextInt();
				c = r.nextInt();
				
				a = 56789 / (b/c);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Divide by zero exception !! ");
				a = 0;
			}
			
			System.out.println("a : " + a);
		}
	}

}
