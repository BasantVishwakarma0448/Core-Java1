package ray;

public class secondlargest {
	public static void main(String[] args) {
		int a[] = {12, 34, 45, 56, 58, 29};
		int x=0;
		int b[]=a;
		int y=0;
		int s=0;
		for(int i=0; i<a.length; i++) {
			if(b[i]>x) {
				s=y;
				y=x;
				x=b[i];
				
			}
			else if(b[i]>y&&b[i]<x&&s<x&&y>s) {
				b[i]=x;
				x=y;
				y=s;
				s=b[i];
			}
		}
		System.out.println(s);
		//System.out.println(x);
	}
}
