// CLASS MAIN

package Ornek3;

import Ornek2.ThreadOrnek;

public class Main {

	public static void main(String[] args) {

		TahminThread t1 = new TahminThread(61);
		TahminThread t2 = new TahminThread(61);
		
		t1.start();
		t2.start();

	}

}

// CLASS TAHMINTHREAD

package Ornek3;

import java.util.Random;

import Ornek2.ThreadOrnek;

public class TahminThread extends Thread{
	
	int sayi;
	public TahminThread(int sayi) {
		this.sayi = sayi;
		System.out.println(this.getName() + " olustu ..");;
	}


	@Override
	public void run() {
		
		//int sayi = (int) (Math.random() * 100 + 1);
		
		int sayac = 0;
		int tahmin;
		/*
		do
		{
			tahmin = (int) (Math.random() * 100 + 1);
			sayac++;
			System.out.println(this.getName() + " Tahmin  : " + tahmin);
		}while(sayi != tahmin);
			
			
		 System.out.println(this.getName() + " dogru tahmin etti. Deneme Sayisi : " + sayac + " Sayimiz : " + sayi);
		*/
		synchronized(ThreadOrnek.class)  // sirali bir sekilde calismasini sagladik.
		{
			do
		{
			tahmin = (int) (Math.random() * 100 + 1);
			sayac++;
			System.out.println(this.getName() + " Tahmin  : " + tahmin);
		}while(sayi != tahmin);
			System.out.println(this.getName() + " dogru tahmin etti. Deneme Sayisi : " + sayac + " Sayimiz : " + sayi);
		}
		
	}
	

}

