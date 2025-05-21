package day_5;
class Chocolate{
	void eat() {
		System.out.println("Type of choclate");
	}
}
class Dark extends Chocolate{
	void taste1() {
		System.out.println("Dark choclate is sour in taste");
	}
}
class Sweet extends Chocolate{
	void taste2() {
		System.out.println("Sweet choclate is sweet in taste");
	}
}
class Bournvelli extends Dark{
	void Cost1() {
		System.out.println("Bournvelli's price is 100");
	}
}
class Amul extends Dark{
	void Cost2() {
		System.out.println("Amul's price is 150");
	}
}
class Dairy_milk extends Sweet{
	void Weight1() {
		System.out.println("Dairy_milks's weight is 10g");
	}
}
class Kit_Kat extends Sweet{
	void Weight2() {
		System.out.println("Kit_Kat's weight is 30g");
	}
}

public class inheritance_To_Do {

	public static void main(String[] args) {
		Bournvelli b1 =new Bournvelli();
		Amul a1 = new Amul();
		Dairy_milk d1 = new Dairy_milk();
		Kit_Kat k1 = new Kit_Kat();
		b1.eat();
		b1.taste1();
		b1.Cost1();
		a1.Cost2();
		d1.taste2();
		d1.Weight1();
		k1.Weight2(); 
	}

}
