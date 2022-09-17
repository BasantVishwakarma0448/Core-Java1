package ray;

public class Pattern {
	public static void main(String[] args) {
		int i=0, j=0, n=7;
		for(i=0; i<n; i++) {
			for(j=2*(n-i); j>=0; j--) {
				System.out.print(" ");
			}
			for(j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
