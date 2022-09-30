package in.co.Cloning;
//Deep cloning
public class Account implements Cloneable {
	public String name=null;
	public ShallowClone account = null;
	public Account(String n) {
		name = n;
		account = new ShallowClone (4000);
	}
	public Object clone()throws CloneNotSupportedException{
		Account a = (Account)super.clone();
		a.account=(ShallowClone)account.Clone();
		return a;
		
	}
	public static void main(String[] args) throws CloneNotSupportedException{
		Account a1 = new Account("Basant");
		Account a2 = (Account)a1.clone();
		
		a2.name = "Rameshwar";
		a2.account.balance=35000;
		
		
		//original
		System.out.println("Name: " + a1.name);
		System.err.println("Balance: " + a1.account.balance);
		
		//After cloning
		System.out.println("Name: " + a2.name);
		System.out.println("Balance: " + a2.account.balance);
	}
}
