package Day_6;
class Test1{
	void show() {
		System.out.println("hi");
	}
}

public class final2 extends Test1 {
	void show() {
		int a=23;
		System.out.println(a);
		a=32;
		System.out.println(a);
	}

	public static void main(String[] args) {
		final2 f2 = new final2();
		f2.show();

	}

}
