package d2;


public class switchcases {

	public static void main(String[] args) {
		String color=args[0];
		switch(color) {
		case "red":
			System.out.println("celebrate holi");
			break;
		case"green":
			System.out.println("celebrate ramzan");
			break;
		case "white":
			System.out.println("celebrate chrismas");
			break;
		default :
			System.out.println("No festival");
		}

	}

}
