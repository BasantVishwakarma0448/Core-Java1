package ray;

public class TwoDimentional {
public static void main(String[] args) {
	int [][] b =  {{2,4,6,8,10,12,14,16,18,20}, {3,6,9,12,15,18,21,24,27,30},           {4,8,12,16,20,24,28,32,36,40}};
	for(int i=0; i<=2; i++) {
		for(int j=0; j<10; j++) {
			System.out.println(+ b[i][j]);
		}
		System.out.println(" ");
	}
}
}
