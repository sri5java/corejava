package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo2 {
	public static void main(String args[]){
		PriorityQueue q = new PriorityQueue(15, new MyComparator4());
//		PriorityQueue q = new PriorityQueue();
		
		q.offer("A");
		q.offer("Z");
		q.offer("G");
		q.offer("K");
		System.out.println(q);
	}
}

class MyComparator4 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		String s1= (String)o1;
		String s2 =o2.toString();
		return s2.compareTo(s1);
	}
	
}

