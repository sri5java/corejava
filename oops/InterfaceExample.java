package oops;

class InterfExample {

}

interface MyOwnInterface {

	int x = 20;

	void withDraw(); // Declaration there is no Implemenation or there is no
						// logic

	void accountInfo();

	void balnceCheck();
}

interface MyOwnInterface1 {

	void withDraw1(); // Declaration there is no Implemenation or there is no
						// logic

	void accountInfo1();

	void balnceCheck1();
}

public class InterfaceExample extends InterfExample implements MyOwnInterface, MyOwnInterface1 {

	@Override
	public void withDraw() {
		System.out.println("With Draw Info");

		// TODO Auto-generated method stub

	}

	@Override
	public void accountInfo() {

		System.out.println("Account Info");
		// TODO Auto-generated method stub

	}

	@Override
	public void balnceCheck() {

		System.out.println("balnceCheck Info");
		// TODO Auto-generated method stub

	}

	public static void main(String args[]) {

		// MyOwnInterface m = new MyOwnInterface(); // you canot create object
		// interface
		// for interface.

		MyOwnInterface ie = new InterfaceExample();

		// InterfaceExample ie= new InterfaceExample();

		ie.withDraw();
		ie.accountInfo();
		ie.balnceCheck();

		InterfaceExample moi = new InterfaceExample();
		moi.withDraw();
		moi.accountInfo();
		moi.balnceCheck();
	}

	@Override
	public void withDraw1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void accountInfo1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void balnceCheck1() {
		// TODO Auto-generated method stub

	}

}
