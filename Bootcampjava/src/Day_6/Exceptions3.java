package Day_6;

public class Exceptions3 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);	
		int b = Integer.parseInt(args[1]);
		System.out.println("Hi");
		try {
		int c=a/b;
		System.out.println(c);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("Hi");



	}

}
