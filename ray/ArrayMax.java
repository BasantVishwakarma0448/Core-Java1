package ray;

public class ArrayMax {
	public static void main(String[] args) {
		int [] arr = {20, 30, 45, 58, 37,95};
		int max = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		}
	}

