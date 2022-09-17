package in.co.java.constructor;

public class Account {
	private String number, accountType;
	private double balance;
	public String  getAccountno() {
		return number;
	}
//	public void setAccountno(String number) {
//		this.number=number;
//	}
	public String getType() {
		return accountType;
	}
//	public void setType(String accountType) {
//		this.accountType=accountType;
//	}
	public double getBalance() {
		return balance;
	}
//	public void setbalance(double balance) {
//		this.balance=balance;
//	}
	public Account(String number, String accountType, double balance) {
		this.number=number;
		this.balance=balance;
		this.accountType=accountType;
	}
	
}
