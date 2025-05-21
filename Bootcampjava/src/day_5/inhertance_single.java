package day_5;
class Animal {
	void sleep() {
		System.out.println("Sleeping");
	}
}
class Dog extends Animal{
	void Bark() {
		System.out.println("Dog is Barking");
	}
}

public class inhertance_single {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.sleep();
		d1.Bark();

	}

}
