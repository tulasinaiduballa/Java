package Day_7;

class Tulasi_Naidu extends Exception{
	public Tulasi_Naidu(String message) {
		super(message);
	}
}
public class User_def_exception1 {
	public static void numcheck(int num) throws Tulasi_Naidu {
	if(num % 2 ==0) {
		throw new Tulasi_Naidu("Naku Maths Vachu");
	}else {
		System.out.println("Naku Maths Vachina Ranatte Untundhi");
	}
	}

	public static void main(String[] args) {
		try {
			numcheck(31);
		}catch(Tulasi_Naidu e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Maths Pedda Confusion");
		
	}
	}

}
