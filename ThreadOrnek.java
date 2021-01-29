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


// CLASS RUNNABLE
package Ornek2;

public class TheradRunnable implements Runnable{

	
	public TheradRunnable() {
		
	}


	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " olustu ..");
		synchronized(ThreadOrnek.class)  // sirali bir sekilde calismasini sagladik.
		{
			for(int i=0; i<10; i++)
			{
				System.out.println(Thread.currentThread().getName() + " calisti. Yazdi : " + i );
			}
		}
		
	}
	

}


// CLASS THREADORNEK
package Ornek2;

public class ThreadOrnek extends Thread{

	
	
	public ThreadOrnek() {
		System.out.println(this.getName() + " olustu ..");;
	}


	@Override
	public void run() {
		
		synchronized(ThreadOrnek.class)  // sirali bir sekilde calismasini sagladik.
		{
			for(int i=0; i<10; i++)
			{
				System.out.println(this.getName() + " calisti. Yazdi : " + i );
			}
		}
		
	}
	
	

}
