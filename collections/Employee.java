package collections;

public class Employee {
	String eName;
	int eAge;

	public Employee(String eName, int eAge) {
		this.eName = eName;
		this.eAge = eAge;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteAge() {
		return eAge;
	}

	public void seteAge(int eAge) {
		this.eAge = eAge;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Employee))
			return false;

		Employee employee = (Employee) obj;

		return employee.geteAge() == this.geteAge() && employee.geteName() == this.geteName();
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + eAge;
		result = 31 * result +(eName!=null ? eName.hashCode():0);
		
		return result;
	}

}
