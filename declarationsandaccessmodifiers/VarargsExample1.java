package declarationsandaccessmodifiers;

 class VarargsExample1 {

	// static void display(String value1, String value2, String value3) {
	// System.out.println("display method invoked String");
	// }
	//
//	 static void display(int x, String s) {
//	 System.out.println("display method invoked for empty arguments ");
//	 }

	 static void display(int x, String... values) {
		System.out.println("display method invoked for empty arguments ");
	}

	 static public void main(String... aj) {

		display(10,"srikanth");// zero argument
		display(20,"my", "name", "is");// three arguments
		display(30,"Srikanth");
		display(40,"AJ", "Srikanth");
	}
}
