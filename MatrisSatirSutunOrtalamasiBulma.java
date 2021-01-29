import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int satir, sutun;
		
		System.out.print("Satir sayisi : ");
		satir = scanner.nextInt();
		
		System.out.print("Sutun sayisi : ");
		sutun = scanner.nextInt();
		
		int[][] dizi = new int[satir][sutun];
		
		for(int i=0; i<satir; i++)
		{
			for(int j=0; j<sutun; j++)
			{
				System.out.println(i+". satir " + j + ". sutun elemanini giriniz : ");
				dizi[i][j] = scanner.nextInt();
			}

		}
		
		
		System.out.println("\n -- DIZI --\n");
		for(int i=0; i<satir; i++)
		{
			for(int j=0; j<sutun; j++)
			{
				System.out.print(dizi[i][j] + "  ");
			}
			System.out.println("\n");
		}
		System.out.println("-------------------------");
		
		System.out.println("\n-- Satir Ortalamalari --\n");
		for(int i=0; i<satir; i++)
		{
			int satirtoplam = 0;
			for(int j=0; j<sutun; j++)
			{
				satirtoplam += dizi[i][j];
			}
			System.out.println(i+". satir ortalamasi : " + (satirtoplam/sutun));
		}
		
		System.out.println("\n-- Sutun Ortalamalari --\n");
		for(int i=0; i<sutun; i++)
		{
			int sutuntoplam = 0;
			for(int j=0; j<satir; j++)
			{
				sutuntoplam += dizi[j][i];
			}
			System.out.println(i +". sutun ortalamasi : " + (sutuntoplam/satir));
		}
		
		
		
	}

}
