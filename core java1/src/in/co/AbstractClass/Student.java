package in.co.AbstractClass;

public  class Student implements Richman {

	@Override
	public void donation(int amount) {
		
		System.out.println("Student donation balance: " + (amount+balance));
		
	}

	@Override
	public void party(double entry) {
		System.out.println("Student Party balance: " + (entry+balance));
	}


}
