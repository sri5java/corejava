package collections;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String args[]) {
//		TreeMap m = new TreeMap(new MyComaparator());
		TreeMap m = new TreeMap();
		m.put("XXX", 10);
		m.put("YYY",20);
		m.put("ZZZ",30);
		m.put("LLL", 40);
		m.put("AAAAAAA", 40);


		System.out.println(m);
	}
}

class MyComaparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1= o1.toString();
		String s2=o2.toString();
		
		return -s2.compareTo(s1);
	}
	
}


