package day_5;

public class poly {
	void show() {
		System.out.println("Good Morning");
	}
	void show(int a, int b) {
		System.out.println(a+b);
	}
	void show (double d1,double d2) {
		System.out.println(d1-d2);
	}
	void show (String s1, String s2) {
		System.out.println(s1+s2);
	}

	public static void main(String[] args) {
		poly p1= new poly();
		p1.show();
		p1.show(85,61);
		p1.show(8.6,3.8);
		p1.show("Tulasi","Bharath");
		

	}

}
