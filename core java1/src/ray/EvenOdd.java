//Program for average of consecutive Odd & Even numbers
package ray;

public class EvenOdd {
	public static void main(String[] args) {
		int number=50; 
		double	sumEven=0, sumOdd=0;
		int i=0;
		for(i=0; i<=number; i++) {
			if(i%2==0) {
				sumEven=sumEven+i;
				//System.out.println(i);
			}
			else {
				sumOdd=sumOdd+i;
				//System.out.println(i);
			}
			
		}
		System.out.println("Sum of Odd numbers "+sumOdd/number);
		System.out.println("Sum of Even numbers "+sumEven/number);
	}
}
