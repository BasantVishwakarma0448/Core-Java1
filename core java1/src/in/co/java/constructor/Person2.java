package in.co.java.constructor;

public class Person2 extends Person {
	public Person2(String Fname, String lname) {
		super(Fname, lname);
	}

	@Override
	public String toString() {
		System.out.println("Full Name: " + Fname + " " + Lname);
		return null;
	}
}
