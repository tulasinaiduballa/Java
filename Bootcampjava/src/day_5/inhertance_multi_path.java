package day_5;
class Fruits {
	void benifits() {
		System.out.println("Fruits are Healthy");
	}
}
class Apple extends Fruits{
	void Color() {
		System.out.println("Apple is Red in color");
	}
}
class Mango extends Fruits{
	void Price() {
		System.out.println("Mangos are 100 per Kg");
	}
}
class Banana extends Fruits{
	void Taste() {
		System.out.println("Banana is Sweet in taste");
	}
}


public class inhertance_multi_path {

	public static void main(String[] args) {
		Apple a1 = new Apple();
		Mango m1 = new Mango();
		Banana b1 = new Banana();
		a1.benifits();
		a1.Color();
		//b1.benifits();
		b1.Taste();
		//m1.benifits();
		m1.Price();
	}

}