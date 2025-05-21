package Day_8;

public class Mt3_1 implements Runnable{
	public void run() {
		System.out.println("Hi");	}

	public static void main(String[] args) {
		Mt3_1 m1 = new Mt3_1();
//		Mt3_1 m2 = new Mt3_1();
		
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m1);
		System.out.println("Hello");
		t1.start();
		t2.start();
	}

}
