package day_5;
interface I3{
	void add();
}
interface I2{
	void sub();
}

public class interface2 implements I3,I2{
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
