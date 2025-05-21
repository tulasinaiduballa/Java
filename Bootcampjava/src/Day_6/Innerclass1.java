package Day_6;

public class Innerclass1 {
	void show() {
		System.out.println("Hi");
		class Test2{
			void print() {
				System.out.println("Good Afternoon");
			}
		}
		Test2 t2 = new Test2();
		t2.print();
	}

	public static void main(String[] args) {
		Innerclass1 i1 = new Innerclass1();
		i1.show();
	}

}
