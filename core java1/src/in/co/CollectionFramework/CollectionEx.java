package in.co.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionEx {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add("One");
		c.add("Two");
		c.add("Three");
		c.add("Four");
		
		System.out.println("Length of The Array: "+c.size());
		
		for (Object ele : c) {
			System.out.println(ele);
		}
		System.out.println(c);
		
//		Object [ ] arr = c.toArray();
//		
//		
//		for (Object ele : arr) {
//			String s = ele.toString();
//			System.out.println(s);
//		}
	}
}
