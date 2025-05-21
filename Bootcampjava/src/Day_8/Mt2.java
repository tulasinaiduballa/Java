package Day_8;

public class Mt2 implements Runnable{
	public void run() {
		System.out.println("Hi");	}

	public static void main(String[] args) {
		Mt1 m1 = new Mt1();
		Thread t1 = new Thread(m1);
		System.out.println("Hello");
		t1.start();
	}

}
