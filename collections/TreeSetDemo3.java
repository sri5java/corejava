package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
	public static void main(String args[]) {
		@SuppressWarnings("unchecked")
		TreeSet t = new TreeSet(new MyComparator());
//		TreeSet t = new TreeSet();
		
		t.add(10);
		t.add(0); //
		t.add(15);//
		t.add(5);//
		t.add(20);//

		System.out.println(t);

	}
}

class MyComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub

		Integer i1 = (Integer) obj1;
		Integer i2 = (Integer) obj2;

		if (i1 > i2) {
			return -1;   //object1 has to come after object2
		} else if (i1 < i2) {
			return +1;   //object1 has to come before object2
		} else {
			return 0;  //object1 and object2 are equal 
		}
	}
}
