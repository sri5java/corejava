package declarationsandaccessmodifiers;

public class FinalTestExample {

	// --> final instance variable
	   int x;
//	final int y = 80;
//	final int z;
//
//	//
//	{
//		x = 10;
//	}
//
//	//
//	FinalTestExample() {
//		// x=10;
//		// y=20;
//		z = 30;
//	}

	// --> final static variables
//	 final static int x;
//
	 static{
//	 x=10;
	 }
//	 
	 
//	 FinalTestExample() {
//			 x=10;
//		}
	 

	// --> final local variables

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// local variable
		 int a=100;

		FinalTestExample ft = new FinalTestExample();
//		System.out.println(ft.x + "  " + ft.y + "  " + ft.z);
		// System.out.println(ft.x );
		System.out.println(a);

	}

}
