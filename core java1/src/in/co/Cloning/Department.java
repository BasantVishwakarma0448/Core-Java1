package in.co.Cloning;

public class Department {
	//Deep cloning....
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e = new Employee("Ram");
		Employee e2 = (Employee)e.clone();
		e2.name = "Shyam";
		e2.add.setpaddress("Sagar");
		e2.add.setladdress("Bhopal");
		
		System.out.println("1 Name: "+e.name);
		System.out.println("1 Permanent Address: "+e.add.getpaddress());
		System.out.println("1 local Address: "+e.add.getladdress());
		
		System.out.println("---------------------------------------------");
		
		System.out.println("2 Name: "+e2.name);
		System.out.println("2 Permanent Address: "+e2.add.getpaddress());
		System.out.println("2 local Address: "+e2.add.getladdress());
		
		
		
//		 System.out.println(e.paddress);
//		 System.out.println(e.laddress);
	}
}
