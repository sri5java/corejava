package oops;

public class StaticMemberExample {
	public static void main(String[] args) {

		ObjectCounter object1 = new ObjectCounter();
		System.out.println(object1.getNumberOfObjects());

		ObjectCounter object2 = new ObjectCounter();
		System.out.println(object2.getNumberOfObjects());

	}
}

class ObjectCounter {

	static int counter = 0;

	public ObjectCounter() {

		counter++;
	}

	// returns number of objects created till now
	public int getNumberOfObjects() {
		return counter;
	}

	{
		System.out.println(counter);
	}
}
