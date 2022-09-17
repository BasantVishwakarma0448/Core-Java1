package in.co.AbstractClass;

public abstract class Abstract {
	private String name;
	private int id, bankbalance;
	//abstract void Info();
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	public int getBankbalance() {
		return bankbalance;
	}
	public void setBankbalance(int bankbalance) {
		this.bankbalance = bankbalance;
	}
}
