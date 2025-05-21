package day_4;

public class test1 {
	int x;
	int y;
	public test1(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public test1(test1 t1) {
		this.x=t1.x;
		this.y=t1.y;
		System.out.println(x-y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 t1=new test1(73,31);
		test1 t2=new test1(t1);

	}

}
