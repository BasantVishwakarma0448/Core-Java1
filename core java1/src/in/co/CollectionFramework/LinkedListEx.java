package in.co.CollectionFramework;

import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList l = new LinkedList<>();
		
		l.add(1);
		l.add(2);
		
		for (Object o : l) {
			System.out.println(o);
		}
//		LinkedList b = new LinkedList<>();
//		b.add(2);
//		b.add(5);
		
//		System.out.println(l.getFirst());
//		System.out.println(l.getLast());
//		System.out.println(l.equals(b));
		System.out.println(l.clone());
	}
}
