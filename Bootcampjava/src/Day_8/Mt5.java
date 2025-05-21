package Day_8;

class Test extends Thread{
	public void run() {
		System.out.println("Hi");	
		}
}

class Test5 extends Test{
	public void run() {
		System.out.println("Hello");	
		}
}

class Test6 implements Runnable{
	public void run() {
		System.out.println("Namaste");	
		}
}

public class Mt5 extends Test5{
	public void run() {
		System.out.println("Vankkam");	
		}

	public static void main(String[] args) {
		Test  t = new Test();
		Test5 t1 = new Test5();
		Test6 t2 = new Test6();
		Mt5 m1 = new Mt5();
		t.start();
		t1.start();
		Thread m2 = new Thread(t2);
		m2.start();
		Thread m3 = new Thread(m1);
		m3.start();
		
	}

}
