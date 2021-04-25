package oops;

class EncapsulationDemo {

	private int ssn; // 111111
	private String empName; // mario
	private int empAge; // 32

	public int getSsn() {
		return ssn; // 111111
	}

	public void setSsn(int ssn) { /// 111111
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName; // mario
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge; // 32
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}

public class Encap1 {
	public static void main(String args[]) {
		EncapsulationDemo obj = new EncapsulationDemo();

		EncapsulationDemo obj1 = new EncapsulationDemo();

		// System.out.println(" :"+ obj.ssn);

		obj.setEmpName("Mario");
		obj.setEmpAge(32);
		obj.setSsn(111111);

		System.out.println("Employee Name: " + obj.getEmpName());
		System.out.println("Employee SSN: " + obj.getSsn());
		System.out.println("Employee Age: " + obj.getEmpAge());

		obj1.setEmpName("AJ");
		obj1.setEmpAge(28);
		obj1.setSsn(2222222);

		System.out.println("============================    ");

		System.out.println("Employee Name: " + obj1.getEmpName());
		System.out.println("Employee SSN: " + obj1.getSsn());
		System.out.println("Employee Age: " + obj1.getEmpAge());
	}
}
