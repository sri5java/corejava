package oops;

interface MyInterface1 {

	void withdraw();

	void balanaceTransfer();

}

public class InterfaceDemo implements MyInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		InterfaceDemo id = new InterfaceDemo();
		MyInterface1 id= new InterfaceDemo();

		id.withdraw();
		id.balanaceTransfer();

	}

	 @Override
	public void withdraw() {
		System.out.println("Withdraw Functionalties");

	}

	 @Override
	public void balanaceTransfer() {
		// TODO Auto-generated method stub
		System.out.println("balanaceTransfer Functionalties");

	}

}


