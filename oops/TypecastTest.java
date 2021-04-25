package oops;

public class TypecastTest {
	public static void main(String args[]) {

		// Object o = new String("sri");
		// StringBuffer sb = (StringBuffer)o;
		// String s = (String)o;

		// String s = new String ("sri");
		// StringBuffer sb = (StringBuffer)s;

		String s1 = new String("sri");
		Object o = (Object) s1;
		System.out.println(s1 == o);
		System.out.println(s1.equals(o));
		//
		// Object o1 = new String ("Sri");

		// Object o = new String("sri");
		// StringBuffer sb = (StringBuffer)o;

		Number i = new Integer(10); // -> Number n = new Integer(10);
		Number n = (Number) i;
		Object o2 = (Object) n; // Object o = new Integer(10);
	}

}
