package in.co.CollectionFrameworks;

import java.util.Iterator;
import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack s = new Stack<>();
		
		s.push("Basant");
		s.push("Ram");
		s.push("Ankit");
		s.push("Ram");
		s.push("Deepak");
		
		
		System.out.println(s);
		
		Iterator i = s.iterator();
		
		while (i.hasNext()) {
			Object object = (Object) i.next();
			System.out.println(object);
			
		}
		
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
	}
}
