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
