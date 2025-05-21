package day_5;
interface I4{
	void add();
}
class test0{
	public void sub() {
		System.out.println("Hello");
	}
}

public class interface3 extends test0 implements I4{
	public void add() {
		System.out.println("Hi");
	}


	public static void main(String[] args) {
		interface1 t1 = new interface1();
		t1.add();
		t1.sub(); 

	}

}
