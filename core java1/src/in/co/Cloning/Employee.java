 package in.co.Cloning;

public class Employee implements Cloneable{
	//Deep cloning....

	public String name=null;
	public Address add = null;
	public Employee(String n) {
		 this.name=n;
		 add = new Address("indore", "Vijaynagar");
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}

	public Object clone() throws CloneNotSupportedException {
		Employee c = (Employee)super.clone();
		c.add = (Address)add.clone();
		return c;
		
	}
}
