package Day_6;

public class innerclass {
	void show() {
		System.out.println("Hi");
	}
	class Test1{
		void print() {
			System.out.println("Hello");
		}
	}

	public static void main(String[] args) {
		innerclass i1 = new innerclass();
		i1.show();
		innerclass.Test1 i2 = new innerclass().new Test1();
		i2.print();

	}

}
