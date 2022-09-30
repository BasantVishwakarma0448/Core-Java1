package in.co.java.constructor;

import java.io.StringWriter;

public  class Person {
	protected String Fname;
	protected String Lname;

	public Person(String Fname, String lname) {
		this.Fname=Fname;
		this.Lname=lname;
	}
	public String toString() {
		return Fname+Lname;
		
	}
}
