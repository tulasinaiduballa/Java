package Day_8;

class Test1 extends Thread{
	public void run() {
		System.out.println("Hi");	
		}
}
class Test2 extends Thread{
		public void run() {
			System.out.println("Good Morning");	
			}
	}
public class Mt4 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		System.out.println("Hello");
		t1.start();
		t2.start();
	}
	}

