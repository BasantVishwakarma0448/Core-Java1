package in.co.java.constructor;

public class TestParent {
	public static void main(String[] args) {
		Parent p = new Parent("basant", "vishwakarma", 123654 );
		//p.setid(123456);
		p.getid();
		//p.setFname("Basant");
		
		//p.setLname("Vishwakarma");
		
		System.out.println(p.getFname() + " " + p.getLname());
		
	}
}
