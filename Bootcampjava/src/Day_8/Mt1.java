package Day_8;

public class Mt1 extends Thread{
	public void run() {
		System.out.println("Hi");	}

	public static void main(String[] args) {
		Mt1 m1 = new Mt1();
		System.out.println("Hello");
		m1.start();
	}

}
