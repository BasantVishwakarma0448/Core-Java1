package in.co.AbstractClass;

public class TestRich {
	public static void main(String[] args) {
		Richman r1 = new Businessman();
		Richman r2 = new Student();
		
		r1.donation(2000);
		r1.party(300);
		
		r2.donation(5000);
		r2.party(456);
	}
}
