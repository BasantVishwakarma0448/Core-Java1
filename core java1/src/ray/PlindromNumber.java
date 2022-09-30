//program for checking the number is palindrom or not
package ray;

public class PlindromNumber {
	public static void main(String[] args) {
		int number=1221, number2=number;
		int i=0;
		int rem=0, rev=0;
		while(number2>0)
		{
			rem=number2%10;
			rev=rev*10+rem;
			number2=number2/10;
		}
		//System.out.println(rev);
		//System.out.println(number);
		
		if(rev==number) {
			System.out.println("Number is palindrom number");
		}
		else {
			System.out.println("Number is not palindrom number");
		}
	}

}
