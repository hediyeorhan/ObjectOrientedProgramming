
public class Main {
	public static void main(String[] args)
	{
		System.out.println("********* DENEME *********");
		Main m1 = new Main();
		Main m2 = new Main();
		System.out.println("m1 : " + m1.toString());
		System.out.println("m2 : " + m2.toString());
		System.out.println("**************************");
		try {
			procA();
			} catch (Exception e) {
			System.out.println("Exc. yakalanýyor");
			}
			procB();
			procC();
	}
	
	static void procA() {// metot dýþýnda excption
		try {
		System.out.println("procA içinde");
		throw new RuntimeException("demo");
		} finally {
		System.out.println("procA's finally");
		}
		}
	
	// Bir try bloðundan geri dön
	static void procB() {
	try {
	System.out.println("procB içinde");
	return;
	} finally {
	System.out.println("procB'deki finally");
	}
	}
	// Bir try bloðunu normal iþle.
	static void procC() {
	try {
	System.out.println("procC içinde");
	} finally {
	System.out.println("procC'deki finally");
	}

}
}
