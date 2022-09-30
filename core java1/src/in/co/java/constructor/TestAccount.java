package in.co.java.constructor;

public class TestAccount {
	 public static void main(String[] args) {
		Account a = new Account("1254789", "Saving", 123654.00);
//		a.setAccountno("123654789");
//		a.setType("saving");
//		a.setbalance(123654);
		System.out.println(a.getAccountno() + " " + a.getType() + " " + a.getBalance());
	}
}
