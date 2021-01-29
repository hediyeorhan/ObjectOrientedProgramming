
public class Main {
	public static void main(String[]  args)
	{
		System.out.println("15.5 : " + convert(15.5));
		System.out.println("14.5 : " + convert(14.5));
		System.out.println("1.3 : " + convert(1.3));
		System.out.println("1.7 : " + convert(1.7));
		System.out.println("1.5 : " + convert(1.5));
		System.out.println("2.5 : " + convert(2.5));
	}
	
	public static int convert(double sayi)
	{
		int tam = (int)sayi;
		double kusur = sayi - tam;
		
        if(kusur < 0.5)
        {
        	tam = tam;
        }
        else if(kusur > 0.5)
        {
        	tam += 1;
        }
        else
        {
        	if(tam % 2 == 0)
        		tam = tam;
        	else
        	{
        		tam += 1;
        	}
        	
        }
		
		return tam;
	}

}
