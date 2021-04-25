package languagefunda;

public class MyImplementation implements MyInterface {

	@Override
	public int subtraction() {
		int a = 3000;
		int b = 6000;
		int c = b - a;
		System.out.println(c);
		return c;
	}

	@Override
	public int multiplication() {
		int a = 3000;
		int b = 6000;
		int c = b * a;
		System.out.println(c);
		return c;
	}

}
