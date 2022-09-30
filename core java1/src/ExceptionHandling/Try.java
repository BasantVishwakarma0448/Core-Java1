package ExceptionHandling;

public class Try {
	public static void main(String[] args) {
		 int a = 0, b = 46;
		 
		 try {
			 int c = b/a;
			 System.out.println(c);
		 }
		 finally {
			 System.out.println("Invailid numbers");
		 }
		 
		 //this try and finally block cause Arithmetic exception
	}
}
