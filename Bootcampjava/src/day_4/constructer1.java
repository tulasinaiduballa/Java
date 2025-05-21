package day_4;

public class constructer1 {
	int a=30;
	public void add() {
		System.out.println("add");
	}
	public void sub() {
		this.add();
		System.out.println(this.a);
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructer1 t1=new constructer1();
		t1.sub();

	}

}
