package in.co.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		
		h.add("Basant");
		h.add("Vishwakarma");
		h.add("ram");
		h.add("Shyam");
		
		System.out.println(h);
		
		//System.out.println(h.isEmpty());
		
		//System.out.println(h.remove("Basant"));
		//System.out.println(h);
		
		Iterator i = h.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		//It does not allow duplicate value to added. it can contains only one null value. Hashset does not maintain any order when iterate elements.
	}
}
