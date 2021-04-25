package collections;

import java.util.HashSet;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e = new Employee("Jenny", 22);
		Employee e1 = new Employee("Jenny", 21);
		Employee e2 = new Employee("Jenny", 22);
		
		String s = "Jenny";
		String s1= "Jenny";
		HashSet<String> h = new HashSet<String>();
		h.add(s);
		h.add(s1);
		System.out.println(h);
		

		HashSet<Employee> employees = new HashSet<Employee>();
		employees.add(e);
	
		System.out.println("Boolean value " + employees.contains(e2));

		System.out.println("Employee : " + e.hashCode());
		System.out.println("Employee 2 : " + e2.hashCode());

	}

}
