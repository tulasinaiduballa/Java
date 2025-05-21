package day_4;

public class test2 {
	double x;
	double y;
	double z;
	public test2() {
		System.out.println("Welcome to my profile:B.Tulasi Naidu");
	}
	public test2(double x) {
		this.x=x;
		System.out.println(x);
	}
	public test2(double x,double y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public test2(double x,double y,double z) {
		this.x=x;
		this.y=y;
		this.z=z;
		System.out.println(x+y+z);
	}

	public static void main(String[] args) {
		
		test2 t1=new test2();
		test2 t2=new test2(9.8);
		test2 t3=new test2(9.8,79.9);
		test2 t4=new test2(9.8,79.9,7.5);
	}

}
