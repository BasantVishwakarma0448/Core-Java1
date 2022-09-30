package ExceptionHandling;

public class Int {
	public static void main(String[] args) {
		int a = 0;
		int b = 12;
		
		try {
			int c = b/a;
			System.out.println("Division: " + c);
		}
		catch(Exception e){
			System.out.println("Devided by Zero");
		}
		
		//using Exception object all type  of exceptions are handled from the code 
	}
}
