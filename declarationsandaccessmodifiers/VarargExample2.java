package declarationsandaccessmodifiers;

   class VarargExample2 {

	 private int a =10;
	 
	static void display(String... values) {
		System.out.println("display method invoked1 ");
		
		for (String s : values) {
			System.out.println(s);
		}
	}

	public static void main(String args[]) {

//		display();// zero argument
//		display("hello");// one argument
		display("my", "name", "is", "Sri", "kanth");// four arguments
	}
}
