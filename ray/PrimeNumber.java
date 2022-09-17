//program for the checking Prime number
package ray;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=13;
		int i=1, count=0;
		for(i=1; i<=num; i++){
			if(num%i==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println("Number is Prime");
		}
		else {
			System.out.println("Number is not prime");
		}
	
	}

}
