import java.util.Scanner;

// HEDIYE ORHAN - 18010011087

public class Main {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args)
	{
		int menu;
		Departman[] departmanlar = BilgileriAl();
		while(1==1)
		{
			System.out.println("\t\t\t---------------------------------------------------------\t\t\t\n\t\t\t1))Bilgileri Listele\n\t\t\t2)Departman Adina Gore Arama Yap\n\t\t\t3)Personel Adina Gore Arama Yap\n\t\t\t4)Servis Guzergâhina Gore Arama Yap\n\t\t\t5)Yasi En Buyuk ve En Kucuk Personel/Personelleri Bul\n\t\t\t6)Cikis\n\t\t\t---------------------------------------------------------\n");
			System.out.print("Menu seciniz : ");
			menu = scanner.nextInt();
			switch(menu)
			{
			case 1:
				Departman.BilgileriListele(departmanlar);
				break;
			case 2:
				Departman.DepartmanArama(departmanlar);
				break;
			case 3:
				Personel.PersonelAdArama(departmanlar);
				break;
			case 4:
				Servis.ServisGuzergahArama(departmanlar);
				break;
			case 5:
				Personel.EnBuyukveEnKucukPersonel(departmanlar);
				break;
			case 6:
				System.out.println("\nPROGRAMDAN CIKILIYOR..\n");
				return;
			default:
				System.out.println("\nGECERSIZ MENU SECTINIZ !\n");
				break;
				
			}
		}
		
	}
	
	 public static Departman[] BilgileriAl()
	{
		
		int depsayi, persayi, sersayi;
		
		System.out.print("Kac adet departman bilgisi gireceksiniz? : ");
		depsayi = scanner.nextInt();
		
		Departman[] departmanlar = new Departman[depsayi];
		
		String depad;
	    int depno;
		
		for(int i=0; i<depsayi; i++)
		{   
			System.out.println("\n-----------------------------------------------------------------\n");
			System.out.print((i+1) + ". Departman no giriniz : ");
			depno = scanner.nextInt();
	
			System.out.print((i+1) + ". Departman adi giriniz : ");
			scanner.nextLine();
			depad = scanner.nextLine();
			
			
			System.out.print("Kac adet personel bilgisi gireceksiniz? : ");
			persayi = scanner.nextInt();
			Personel[] personeller = new Personel[persayi];
			
			
			for(int j=0; j<persayi; j++)
			{   int peryas; 
				String perad, persoyad;
				
				scanner.nextLine();
				System.out.print((j+1) + ". Personel adini giriniz : ");
				perad = scanner.nextLine();
				
				
				System.out.print((j+1) + ". Personel soyadini giriniz : ");
				persoyad = scanner.nextLine();
				
				
				System.out.print((j+1) + ". Personel yasini giriniz : ");
				peryas = scanner.nextInt();
				
				personeller[j] = new Personel(depno, perad, persoyad, peryas);
				System.out.println("\n");
				
			}
			
			System.out.print("Kac adet servis bilgisi gireceksiniz? : ");
			sersayi = scanner.nextInt();
			scanner.nextLine();
			Servis[] servisler = new Servis[sersayi];
			
			for(int z=0; z<sersayi; z++)
			{
				String guzergah;
			
				
				System.out.print((z+1) + ". Servis guzergahini giriniz : ");
                guzergah = scanner.nextLine();

				servisler[z] = new Servis(depno, guzergah);

			}
         
			departmanlar[i] = new Departman(depno, depad, personeller, servisler);
		
		}
		return departmanlar;
	}



}
