package languagefunda;

//Class name --> you should starts with Caps
//method name --> Should starts with small letter and next words should be capital
// variable name --> Should starts with small letter and next words should be capital
//a-z or A-Z and numbers 0-9 but 
//Identifiers we should not starts with numbers
//Special Characters _,$

public class IdentifiersDemo {

	// instance variables
	String college_Name = "Java";
	int x$y = 100;
	int $abc = 200;
	public int _s = 500;

	public static void main(String[] args) {

		IdentifiersDemo i1 = new IdentifiersDemo();

		System.out.println(i1.college_Name);
		System.out.println(i1.x$y);
		System.out.println(i1.$abc);
		System.out.println(i1._s);

		i1.numberSubtraction(500, 1000);
	}

	void numberSubtraction(int _a, int _b) {
		int c = _b - _a;
		System.out.println("Subtraction Value is : " + c);
	}

}
