package in.co.Cloning;

public class Address implements Cloneable{
	//Deep Cloning......
	private String paddress, laddress;
	
	public Address(String p, String l) {
		this.paddress=p;
		this.laddress=l;
	}
	
	public void setpaddress(String paddress) {
		this.paddress=paddress;
	}
	public String getpaddress() {
		//System.out.println("Permanent Address: "+paddress);
		return paddress;
	}
	public void setladdress(String laddress) {
		this.laddress=laddress;
	}
	public String getladdress() {
		//System.out.println("Local Address: "+laddress);
		return laddress;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
