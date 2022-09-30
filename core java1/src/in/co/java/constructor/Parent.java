package in.co.java.constructor;
public class Parent {
	private String fname, lname;
	private int id;
	public void getid() {
		System.out.println(id);
	}
//	public void setid(int id) {
//		this.id=id;
//	}
	public String getFname() {
		//System.out.println(fname);
		return fname;
	}
//	public void setFname(String fname) {
//		this.fname=fname;
//	}
	public String getLname() {
		//System.out.println(lname);
		return lname;
	}
//	public void setLname(String lname) {
//		this.lname=lname;
//	}
	public Parent(String Fname, String Lname, int Id ) {
		super();
		this.fname=Fname;
		this.lname=Lname;
		this.id=Id;
	}
	
}
