package Day_6;
class Test3{
	void show() {
		System.out.println("hi");
	}
}

public class final3 extends Test1 {
	void show() {
		int a=23;
		System.out.println(a);
		a=32;
		System.out.println(a);
	}

	public static void main(String[] args) {
		final3 f3 = new final3();
		f3.show();

	}

}
