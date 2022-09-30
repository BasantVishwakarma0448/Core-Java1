package in.co.CollectionFramework;

import java.util.ArrayList;

public class ArrayListex {
	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		
		a.add("one");
		a.add("Two");
		a.add("Three");
		 
		
		for(Object arr : a) {
			System.out.println(arr);
		}
		
		
//		System.out.println(a.get(2));
//		System.out.println(a.addAll(a));
//		a.clear();
		System.out.println(a);
		System.out.println(a.lastIndexOf(a));
	}
}
