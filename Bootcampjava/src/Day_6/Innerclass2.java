package Day_6;
class Sample1{
	private static void show() {
		System.out.println("Hi");
	}
	static class Test1{
		static void print() {
			System.out.println("Hello");
			show();
		}
	}
}
public class Innerclass2 {
	public static void main(String[] args) {
		Sample1.Test1.print();
	}

}
