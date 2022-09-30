package in.co.CollectionFramework;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector v = new Vector<>();
		
		v.add("A");
		v.add("C");
		v.add("B");
		
		System.out.println(v);
		
		v.add(2, "Basant");
		System.out.println(v);
		
//		v.capacity();
//		System.out.println(v.capacity());
		
		System.out.println(v.get(3));;
	}
}
