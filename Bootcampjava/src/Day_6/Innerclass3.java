package Day_6;
class Demo1{
	void show() {
		System.out.println("Hi");
	}
}
public class Innerclass3 {
	Demo1 d1 = new Demo1() {
		void show() {
			System.out.println("Hello");
			super.show();
		}
	};

	public static void main(String[] args) {
		Innerclass3 i3 = new Innerclass3();
		i3.d1.show();
	}

}
