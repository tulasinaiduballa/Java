package day_5;
class Bike {
	void speed() {
		System.out.println("250Kmph");
	}
}
class Bmw extends Bike{
	void rev() {
		System.out.println("1000cc");
	}
}
class Model extends Bmw{
	void Price() {
		System.out.println("Just 30 Lakhs");
	}
}

public class inhertance_multi_level {

	public static void main(String[] args) {
		Model d1 = new Model();
		d1.speed();
		d1.rev();
		d1.Price();

	}

}