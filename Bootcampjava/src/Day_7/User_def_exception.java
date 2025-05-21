package Day_7;

class CheppanuException extends Exception{
	public CheppanuException(String message) {
		super(message);
	}
}
public class User_def_exception {
	public static void agecheck(int age) throws CheppanuException {
	if(age>18) {
		throw new CheppanuException("Nenu Cheppanu");
	}else {
		System.out.println("na age 18 below");
	}
	}

	public static void main(String[] args) {
		try {
			agecheck(31);
		}catch(CheppanuException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Happy Coding");
		
	}
	}

}
