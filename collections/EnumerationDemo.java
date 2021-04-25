package collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String args[]) {

		Vector v = new Vector();
//		ArrayList al = new ArrayList();

		for (int i = 1; i <= 10; i++) {
//			al.add(i);
			v.addElement(i);
		}

		System.out.println(v);

		Enumeration e = v.elements();
//
		while (e.hasMoreElements()) {
			Integer I = (Integer) e.nextElement();

			if (I % 2 == 0)
				System.out.println(I);
		}
		System.out.println(v);
	}
}
