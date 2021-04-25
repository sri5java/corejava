package collections;

import java.util.TreeMap;

public class TreeMapDemo3 {

	public static void main(String args[]){
		TreeMap m = new TreeMap();
		m.put(100, "ZZZ");
		m.put(103,"YYY");
		m.put(101,"XXX");
		m.put(104,106);
		m.put(107,null);
//		m.put(null,"sss");
		
		m.put(999,"XXX");
//		m.put(null,"XXX");
		
		System.out.println(m);
	}
}
