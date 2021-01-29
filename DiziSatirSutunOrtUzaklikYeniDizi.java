import java.text.DecimalFormat;
import java.util.Scanner;

public class DiziSatirSutunOrtUzaklikNewDizi {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.#");
		
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
	    		System.out.print(i + " " + j + " elemanini giriniz : ");
	    		dizi[i][j] = scanner.nextInt();
	    	}
	    }
	    
	    System.out.println("\n\nDizi\n\n");
	    for(int i=0; i<satir; i++)
	    {
	    	for(int j=0; j<sutun; j++)
	    	{
	    		System.out.print(dizi[i][j] + "  ");
	    	}
	    	System.out.println("\n");
	    }
	    
	    double[][] newdizi = new double[satir][sutun];
	    
	    for(int i=0; i<satir; i++)
	    {
	    	int satirtoplam = 0;
	    	double ort = 0;
	    	for(int j=0; j<sutun; j++)
	    	{
	    		satirtoplam += dizi[i][j];
	    	}
	    	ort = (double)satirtoplam/sutun;
	    	
	    	// System.out.println("Ortalama : " + ort);
	    	for(int j=0; j<sutun; j++)
	    	{
	    		newdizi[i][j] = dizi[i][j] - ort;
	    		if(newdizi[i][j] < 0)
	    		{
	    			newdizi[i][j] *= -1;
	    		}
	    	}
	    }
	    
	    
	    System.out.println("\n\nSatir Ortalamalarina Olan Uzakliklar Dizisi\n\n");
	    for(int i=0; i<satir; i++)
	    {
	    	for(int j=0; j<sutun; j++)
	    	{
	    		System.out.print(df.format(newdizi[i][j]) + "  ");
	    	}
	    	System.out.println("\n");
	    }
	    
	    
	    for(int i=0; i<sutun; i++)
	    {
	    	int sutuntoplam=0;
	    	double ort=0;
	    	for(int j=0; j<satir; j++)
	    	{
	    		sutuntoplam += dizi[j][i];
	    	}
	    	ort = (double)sutuntoplam/satir;
	    	
	    	// System.out.println("Ortalama : " + ort);
	    	for(int j=0; j<satir; j++)
	    	{
	    		newdizi[j][i] = dizi[j][i] - ort;
	    		if(newdizi[j][i] < 0)
	    		{
	    			newdizi[j][i] *= -1;
	    		}
	    	}
	    }
	    
	    System.out.println("\n\nSutun Ortalamalarina Olan Uzakliklar Dizisi\n\n");
	    for(int i=0; i<satir; i++)
	    {
	    	for(int j=0; j<sutun; j++)
	    	{
	    		System.out.print(df.format(newdizi[i][j]) + "  ");
	    	}
	    	System.out.println("\n");
	    }
	}

}
