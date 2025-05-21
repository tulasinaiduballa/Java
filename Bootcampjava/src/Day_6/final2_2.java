package Day_6;
class Test2{
	void show() {
		System.out.println("hi");
	}
}

public class final2_2 extends Test2 {
	void show() {
		int a=23;
		System.out.println(a);
		a=32;
		System.out.println(a);
	}

	public static void main(String[] args) {
		final2_2 f2_2 = new final2_2();
		f2_2.show();

	}

}
