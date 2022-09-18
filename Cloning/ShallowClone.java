package in.co.Cloning;

public class ShallowClone implements Cloneable {
	public double balance =0;
	
	public ShallowClone(double balance) {
		super();
		this.balance=balance;
	}
	public Object Clone () throws CloneNotSupportedException{
		return super.clone();
	}
	public static void main (String[] args) throws CloneNotSupportedException {
		ShallowClone b = new ShallowClone(5000);
		ShallowClone b2 = (ShallowClone)b.clone();
		//b2.balance=7000;
		System.out.println(b.balance);
		System.out.println(b2.balance);
	}
}
