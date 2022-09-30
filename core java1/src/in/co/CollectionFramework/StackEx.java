package in.co.CollectionFramework;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<Object> s = new Stack<>();
		
		s.push("Basant");
		s.push("Vishwakarma");
		s.push("Bilahara");
		
		for (Object m : s) {
			System.out.println(m);
		}
		// pop method retruns the last element of the stack and remove it from the collection
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s); 
		
		//peek method returns the last element of the stack and do not remove it from the collection
		//Stack is subclass of vector that implements a standard lass in first out stack 
//		System.out.println(s.peek());
//		System.out.println(s);
	}
}
