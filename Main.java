package Ornek2;

public class Main {

	public static void main(String[] args) {
	
		IkiBasamakliSayi sayi1 = new IkiBasamakliSayi(45);
		
		sayi1.SayiBilgisi();
		
		Sayi sayi2 = new Sayi(65);
		
		System.out.println("\n----------\n");
		sayi2.SayiBilgisi();
		

	}

}
