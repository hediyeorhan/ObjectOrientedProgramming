package Ornek2;

public class Main {

	public static void main(String[] args) {
		
		ThreadOrnek t1 = new ThreadOrnek();
		ThreadOrnek t2 = new ThreadOrnek();
		
		t1.start();
		t2.start();
		
		Thread t3 = new Thread(new TheradRunnable());
		Thread t4 = new Thread(new TheradRunnable());
		
		t3.start();
		t4.start();

	}

}
