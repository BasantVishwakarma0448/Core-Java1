package in.co.CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		Queue q = new LinkedList<>();
		
		q.add("Basant");
		q.add("Ram");
		q.add("Shyam");
		q.add("me");
		
		System.out.println(q);
		
		System.out.println(q.removeAll(q));
		
		System.out.println(q);
	}
}
