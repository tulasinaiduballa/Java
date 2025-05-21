package Day_8;

public class DesmonT extends Thread { // Daemon
	String s;
	public DesmonT(String name) {
		s=name;
	}
	
	public void run() {
		if (Thread.currentThread().isDaemon())
		{
			System.out.println(s + "is Daemon Thread");
		}
		else {
			 System.out.println(s + "is User Thread");
		}
	}

	public static void main(String[] args) {
		DesmonT d1 = new DesmonT("d1");
		DesmonT d2 = new DesmonT("d2");
		DesmonT d3 = new DesmonT("d3");
		
		d1.setDaemon(true);
		
		d1.start();
		d2.start();
		
		d3.setDaemon(false);
		d3.start();

	}

}
