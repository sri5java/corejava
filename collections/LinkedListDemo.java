package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;


public class LinkedListDemo {
	public static void main(String args[])
	{
//		List ll= new LinkedList<>();
		LinkedList ll= new LinkedList();
//		ArrayList  ll = new ArrayList();
		
		ll.add("Sri5");
		ll.add(9);
		ll.add("sri5");
		ll.add(null);
		ll.add(0, "software");
		ll.add(0, "venkata");
		
//		ll.removeLast(); 
//		ll.addFirst("ccc");
//		
//		ll.addLast("sss");
		
//		System.out.println(ll.getLast());
		
		System.out.println(ll);
	}
}
