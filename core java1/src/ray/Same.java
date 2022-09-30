package ray;

public class Same {
	public static void main(String[] args) {
		int[] a= new int[]{0, 2, 3, 3, 2, 4, 5, 6, 7, 3, 7, 1, 2, 5, 4, 8, 9, 2, 1, 1, 3, 2 };
		
		int max=Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
			max=a[i];
			}
			//System.out.println(max);
		}
		int [] b=new int [max+1];
		//System.out.println(max+1);
		for(int i=0; i<a.length; i++) {
			
			b[a[i]]++;
			
		}
		for(int i=0; i<=max; i++) {
			if(b[i]>1) {
				System.out.println(i + " " + b[i]);
			}
		}
			
		}
		
		
	}

