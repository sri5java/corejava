package arrayexamples;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("JAVA");

		list.add("JSP");

		list.add("ANDROID");

		list.add("STRUTS");

		list.add("HADOOP");

		list.add("JSF");

		String[] array = new String[list.size()];

		list.toArray(array);

		for (String string : array) {
			System.out.println(string);
		}
	}
}
