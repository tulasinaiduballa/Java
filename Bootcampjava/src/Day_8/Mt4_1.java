package Day_8;

class Test3 extends Thread{
	public void run() {
		System.out.println("Hi");	
		}
}
class Test4 implements Runnable{
		public void run() {
			System.out.println("Good Morning");	
			}
	}
public class Mt4_1 {

	public static void main(String[] args) {
		Test3 t1 = new Test3();
		Test4 t2 = new Test4();
		System.out.println("Hello");
		t1.start();
		Thread m1 = new Thread(t2);
		m1.start();
	}
	}

