package day_5;
class Movie{
	void Genre() {
		System.out.println("Movie genre is Crime Thiller");
	}
}
class Hit_3 extends Movie{
	void action() {
		System.out.println("Movie is on Ivestigating a crime");
	}
}
class Hero extends Hit_3{
	void Name() {
		System.out.println("Hero is nani");
	}
}
class Heroine extends Hit_3{
	void Looks() {
		System.out.println("Herine is Beautiful");
	}
}

public class inhertance_heirarchical {

	public static void main(String[] args) {
		Hero a1 = new Hero();
		Heroine a2 = new Heroine();
		a1.Genre();
		a1.action();
		a1.Name();
		a2.Looks();

	}

}
