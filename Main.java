
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
			System.out.println("Exc. yakalan�yor");
			}
			procB();
			procC();
	}
	
	static void procA() {// metot d���nda excption
		try {
		System.out.println("procA i�inde");
		throw new RuntimeException("demo");
		} finally {
		System.out.println("procA's finally");
		}
		}
	
	// Bir try blo�undan geri d�n
	static void procB() {
	try {
	System.out.println("procB i�inde");
	return;
	} finally {
	System.out.println("procB'deki finally");
	}
	}
	// Bir try blo�unu normal i�le.
	static void procC() {
	try {
	System.out.println("procC i�inde");
	} finally {
	System.out.println("procC'deki finally");
	}

}
}
