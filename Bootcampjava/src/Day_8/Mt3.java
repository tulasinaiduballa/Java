package Day_8;

public class Mt3 implements Runnable{
	public void run() {
		System.out.println("Hi");	}

	public static void main(String[] args) {
		Mt3 m1 = new Mt3();
		Mt3 m2 = new Mt3();
		
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		System.out.println("Hello");
		t1.start();
		t2.start();
	}

}
