package ray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayShort {	
		public static void main(String[] args) {
			int a[]= {122, 34, 55, 45,36, 58, 69};
			for(int num:a) {
				System.out.println(num+" ");
			}
			Arrays.binarySearch(a, 3);
			System.out.println("Array after sorting: ");
			for(int num : a) {
				System.out.println(num+" ");
			}
		}
}
