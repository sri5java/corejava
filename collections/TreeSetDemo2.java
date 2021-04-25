package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {
public static void main(String args[]){
	TreeSet<String> t = new TreeSet(new MyComparator1());
//	TreeSet t = new TreeSet();
	
	t.add("Arun");
	t.add("Srikanth");
	t.add("Nikhil");
	
	System.out.println(t);
}
}

class MyComparator1 implements Comparator {

//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		return 0;
////	}

	@Override
	public int compare(Object o1, Object o3) {
		// TODO Auto-generated method stub
		
		String s1= o1.toString();
		String s2= o3.toString();
		
		return s2.compareTo(s1);
		
		
	}
	
}
