package arrayexamples;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
		String[] array = new String[] { "ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF" };

		ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));

		System.out.println(list);
	}
}
