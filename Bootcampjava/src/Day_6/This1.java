package Day_6;

public class This1 {
	int a=546;
	void add() {
		int a=546;
		System.out.println(a);
	}
	void sub() {
		System.out.println(this.a);
		this.add();
	}

	public static void main(String[] args) {
		This1 t1 = new This1();
		t1.sub();

	}

}
