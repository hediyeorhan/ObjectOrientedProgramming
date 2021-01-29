/*public abstract class Calisan_1887 {
	public int id;
	public String ad;
	public String soyad;
	public int yas;
	public int cs;
	private static int sayac = 998;
	
	
	public Calisan_1887(String ad, String soyad, int yas, int cs) {
		this.id = sayac + 2;
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		this.cs = cs;
	}
	
	public abstract double ZamOraniHesapla(); 
	

}


public class Isci_1887 extends Calisan_1887 implements Maas_1887 {
	
	public String gorev;

	public Isci_1887(String ad, String soyad, int yas, int cs, String gorev) {
		super(ad, soyad, yas, cs);
		this.gorev = "Isci";
	}

	@Override
	public double MaasHesapla() {
		double maas = ZamOraniHesapla();
		maas += 3000.0;
		return maas;
	}

	@Override
	public double ZamOraniHesapla() {
		double zam = 0.0;
		zam += ((double)cs * 100) + ((yas * ((double)2/3)));
		return zam;
	}
	
	

}



public interface Maas_1887 {
	public abstract double MaasHesapla();

}


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;





public class Anasayfa_1887 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		int is;
		
		System.out.println("Kac isci bilgisi gireceksiniz : ");
		is = scanner.nextInt();
		
		ArrayList<Isci_1887> isciler = new ArrayList<Isci_1887>();
        
		String ad, soyad, gorev;
		int yas, cs;
		
		for(int i=0; i<is; i++)
		{
			System.out.println("Isci ad giriniz : ");
			ad = scanner.next();
			System.out.println("Isci soyad giriniz : ");
			soyad = scanner.next();
			System.out.println("Isci gorev giriniz : ");
			gorev = scanner.next();
			System.out.println("Isci yas giriniz : ");
			yas = scanner.nextInt();
			System.out.println("Isci cs giriniz : ");
			cs = scanner.nextInt();
			Isci_1887 isci = new Isci_1887(ad, soyad, yas, cs, gorev);
			isciler.add(isci);
			System.out.println("\n -------------------------- \n");
		}
		
		
		System.out.println("\n\t -- Tum Isciler ve Bilgileri  -- \n");
		for(Isci_1887 i : isciler)
		{
			System.out.println("Isci id : " + i.id + "\nIsci ad : " + i.ad + "\nIsci soyad : " + i.soyad + "\nIsci gorev : " + i.gorev + "\nIsci yas : " + i.yas + "\nIsci cs : " + i.cs + "\nIsci maas : " + i.MaasHesapla());
			System.out.println("---------------------------------------------------");
		}

		
		File file = new File("isciler.txt");
		FileWriter fw = new FileWriter(file, true);  
		BufferedWriter bw = new BufferedWriter(fw);
		
		if(!file.exists())
		{
			file.createNewFile();
		}
		
		for(Isci_1887 isci : isciler)
		{
			bw.write(isci.id + " " + isci.ad + " " + isci.soyad + " " + isci.gorev + " " + isci.yas + " " + isci.cs +  " " + isci.MaasHesapla() +"\n");
		}
		
		bw.close();
	}

}*/
