package in.co.AbstractClass;

public class Businessman implements Richman {
	
	@Override
	public void donation(int amount) {

		System.out.println("Businessman donation balance: " + (amount+balance));
		
	}

	@Override
	public void party(double entry) {
		System.out.println("Businessman Party balance: " + (entry+balance));
	}

}
