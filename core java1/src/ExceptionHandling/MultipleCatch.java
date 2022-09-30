package ExceptionHandling;

public class MultipleCatch {
	public static void main(String[] args) {
		String name = null;
		//generic exception
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(3));
			System.out.println(name.codePointBefore(2));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Name index is too small");
		}
		catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Index number is out of bounds");
		}
//		catch (RuntimeException e) {
//			//System.out.println("Null value");
//			System.out.println(e.getMessage());
//		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("please enter any name or word");
		}
		
		//In this type of exception handling we got the main exception in to the class i,e. run time exception or string out of bounds exception
	}
}
