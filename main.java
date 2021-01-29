import java.util.Scanner;

public class main {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);	
		
		System.out.print("Basamak degeri hesaplamak icin bir sayi giriniz : ");
		
		int n = scanner.nextInt();
		int d = 1;
		
		
		while(n > 9)
		{
		     n = n/ 10;
		     d = d + 1;
		}
		System.out.println("**********************");
		System.out.println("Basamak sayisi : " + d);
	}

}
