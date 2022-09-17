package ray;

public class TestEncap {
	 public static void main(String[] args) {
		Encapsulation en = new Encapsulation();
		en.setId(23654);
		en.setFname("Basant");
		en.setLname("Vishwakarma");
		
		System.out.println(en.getId());
		System.out.println(en.getFname()+" "+en.getLname());
	}
}
