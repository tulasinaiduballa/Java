package day_5;
interface I1{
	void add();
	void sub();
}

public class interface1 implements I1{
	public void add() {
		System.out.println("Hi");
	}
	public void sub() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		interface1 t1 = new interface1();
		t1.add();
		t1.sub(); 

	}

}
