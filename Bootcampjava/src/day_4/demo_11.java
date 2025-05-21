package day_4;

public class demo_11 {
	private String firstname;
	private String lastname;
	private String email;
	private long phonenumber;
	
	public void setFirstName (String fn) {
		firstname=fn;
	}
	public void setLastName (String ln) {
		lastname=ln;
	}
	public void setEmail(String em) {
		email=em;
	}
	public void setPhoneNumber(long pn) {
		phonenumber=pn;
	}
	
	public String getFirstName() {
		return firstname;
	}
	
	public String getLastName() {
		return lastname;
	}
	public String getEmail() {
		return email;
	}
	public long getPhoneNumber() {
		return phonenumber;
	}

	public static void main(String[] args) {
		
		demo_11 d1=new demo_11 ();
		d1.setFirstName("Barath");
		d1.setLastName("Reddy");
		d1.setEmail("Barath_Reddy@gmail.com");
		d1.setPhoneNumber(7013028716l);
		System.out.println(d1.getFirstName ());
		System.out.println(d1.getLastName ());
		System.out.println(d1.getEmail ());
		System.out.println(d1.getPhoneNumber ());
	}

}
