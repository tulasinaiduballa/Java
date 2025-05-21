package Day_8;

public class Mt8 implements Runnable{
	public void run() {
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Mt8());
		t1.start();
	}

}
