package oops;

class EnacpsulationDemo {

	private String empName;
	private int empAge;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}

public class EncapsTest {

	public static void main(String[] args) {

		EnacpsulationDemo ed = new EnacpsulationDemo();

		ed.setEmpAge(28);
		ed.setEmpName("Srikanth");

		System.out.println("Welcome: " + ed.getEmpName());
		System.out.println("Employee Age: " + ed.getEmpAge());

	}
}
