package day_4;

public class sample {
	int a;
	int b;
	public sample(int x,int y) {
		a=x;
		b=y;
		System.out.println(x+y);
	}
	public void add() {
		System.out.println(this.a-this.b);
	}
		

	public static void main(String[] args) {
		sample t1=new sample(78,34);
		t1.add();
	}

}
