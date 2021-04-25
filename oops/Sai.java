package oops;

class SaiParent {
	public void money() {
		System.out.println("For money");
	}

	public void house() {
		System.out.println("House");
	}
}

public class Sai extends SaiParent {

	public void knowledge() {
		System.out.println("knowledge");
	}

	public static void main(String args[]) {
		Sai s = new Sai();
		s.knowledge();
		s.money();
		s.house();

	}

}
