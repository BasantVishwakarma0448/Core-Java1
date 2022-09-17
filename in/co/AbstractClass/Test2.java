package in.co.AbstractClass;

public class Test2 {
	public static void main(String[] args) {
		Abstract a = new Testabs();
		//a.Info();
		a.getname();
		a.setname("Basant Vishwakarma");
		a.setBankbalance(234627384);
		a.getBankbalance();
		a.getid();
		a.setid(123456789);
		System.out.println(a.getname()+ " " + a.getid() + " " + a.getBankbalance());
	}
}
