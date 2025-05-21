package day_5;
class Sample45{
	public Sample45() {
		System.out.println("Good evening");
	}
	int x=99;
	void print() {
		System.out.println("hello");
	}
}

public class super1 extends Sample45{
	public super1() {
		super();
	}
	void show() {
		int y=45;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		super1 s1= new super1();
		s1.show();
	}

}
