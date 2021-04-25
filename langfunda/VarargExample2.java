package langfunda;

class VarargExample2 {
	
	String s1;
	static void display(String... values) {
		System.out.println("display method invoked1 ");
		
		for (String s : values) {
			System.out.println(s);
		}
		
	}

	public static void main(String args[]) {

		display();// zero argument
		display("hello");// one argument
		display("my", "name", "is", "Sri", "kanth");// four arguments
		
		VarargExample2 v2 = new VarargExample2();
		System.out.println(v2.s1);
	}
}
