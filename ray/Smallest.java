package ray;

public class Smallest {
	public static void main(String[] args) {
		int a[]= {12, 30, 4, 45, 68};
		int small=a[0];
		int x=0;
		int y=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]<small) {
				y=x;
				x=small;
				small=a[i];
			}
			else if(small<x&&small<y) {
				small=y;
				y=x;
				x=small;
			}
		}
		System.out.println(x);
		System.out.println(small);
	}
}
