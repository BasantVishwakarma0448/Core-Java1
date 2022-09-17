//program for Reverse the number
package ray;

public class ReverseDigit {
	public static void main(String[] args) {
		int num=3216;
		int rev=0, rem;
		//int i=0;
		while(num>0){
			rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		//System.out.println(rev);
		}
		System.out.println("reverse number : " + rev);
	}
	
}
