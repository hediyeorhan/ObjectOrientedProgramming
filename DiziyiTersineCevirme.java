import java.util.Scanner;

public class DiziyiTersineCevirme {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int ds;
		
		System.out.print("Dizi boyutu giriniz : ");
		ds = scanner.nextInt();
		
		int[] dizi = new int[ds];
		
		for(int i=0; i<ds; i++)
		{
			System.out.print(i+". elemani giriniz : ");
			dizi[i] = scanner.nextInt();
		}
		
		for(int i=0; i<ds; i++)
		{
			System.out.print(dizi[i] + " - ");
		}
		
		System.out.println("\nDizinin ters hali\n");
		System.out.println("-------------------------");
		
		for(int i=ds-1; i>=0; i--)
		{
			System.out.print(dizi[i] + " - ");
		}
	}

}
