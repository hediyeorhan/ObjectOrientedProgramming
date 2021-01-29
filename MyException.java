
public class Main {
	public static void main(String[] args)
	{
		try
		{
		compute(1);
		compute(20);
		}
		catch(MyException e)
		{
			System.out.println("Yakalaniyor .. " + e);
		}
		
		
		
	}
	
	public static void compute(int a) throws MyException
	{
		if(a > 10)
			throw new MyException(a);
		System.out.println("Normal  cikis");
	}

}


// CLASS MYEXCEPTION


public class MyException extends Exception{
	private int sayac;
	
	MyException(int a) // constructor
	{
		sayac = a;
	}
	
	
	public String toString()
	{
		return "MyException[" + sayac + "]";
	}
	

}

