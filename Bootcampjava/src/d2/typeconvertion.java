package d2;

public class typeconvertion {

	public static void main(String[] args) {
		int a1=Integer.parseInt(args[0]);
		double d1=Double.parseDouble(args[1]);
		float b=Float.parseFloat(args[2]);
		String a=args[3];
		char ch=args[4].charAt(0);
		boolean c=Boolean.parseBoolean(args[5]);
		long l=Long.parseLong(args[6]);
		byte b1=Byte.parseByte(args[7]);
		
		System.out.println(a1);
		System.out.println(d1);
		System.out.println(b);
		System.out.println(a);
		System.out.println(ch);
		System.out.println(c);
		System.out.println(l);
		System.out.println(b1);

	}

}
