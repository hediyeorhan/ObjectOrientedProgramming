import java.util.Scanner;

public class AsalSayi {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bir sayi giriniz : ");
		int sayi = scanner.nextInt();
		int sonuc = AsalMi(sayi);
		if(sonuc == 1 || sayi == 2)
		{
			System.out.print("Sayi asaldir.");
		}
		else if(sonuc == 0)
		{
			System.out.print("Sayi asal degildir.");
		}
	}
	
	public static int AsalMi(int sayi)
	{
		int i;
		int sonuc = -1;
		for(i=2; i<sayi; i++)
		{
			if(sayi % i == 0)
			{
				
				sonuc = 0;
				break;
			}
			else
			{
				
				sonuc = 1;
			}
				
		}
		return sonuc;
		
	}

}
