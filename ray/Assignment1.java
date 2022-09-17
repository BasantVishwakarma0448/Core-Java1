package ray;

public class Assignment1 {
	static boolean z;
	public static void main(String[] args) {
		
		int b = position();
		if(z) {
			System.out.println(b);
		}
	}
	public static int position() {
		int a[]= {1, 3, 5, 6, 8, 2};
		int x=8;
		for(int i=0; i<a.length; i++) {
			int y=a[i];
			if(x==y) {
				System.out.println(i);
			}
			else {
				z=x!=y;
			}
			
		}
		return -1;
	}
}
