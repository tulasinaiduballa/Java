package Day_6;
class Test4{
	void show() {
		System.out.println("hi");
	}
}

public class final3_3 extends Test4 {
	void show() {
		int a=23;
		System.out.println(a);
		a=32;
		System.out.println(a);
	}

	public static void main(String[] args) {
		final3_3 f3_3 = new final3_3();
		f3_3.show();

	}

}
