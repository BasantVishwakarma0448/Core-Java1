package in.co.CollectionFramework;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		
		t.add("one");
		t.add("two");
		t.add("three");
		
		System.out.println(t);
		
		
		t.remove("three");
		
		System.out.println(t);
		
//		t.add("three");
//		System.out.println(t);
		//Treeset is silmilar to hashset except that it sorts the elements in the ascending order. And this is not allow duplicate value to be added.
	}
}
