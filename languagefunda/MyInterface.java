package languagefunda;

//SRS : Service requirement Specification
// 100 % abstraction : Hiding the implementation
public interface MyInterface {

	public abstract int subtraction();

	int multiplication();

}


class MyImplementationDemo1 {

	static public strictfp synchronized void main(String[] args) {
		MyInterface m = new MyImplementation();
		m.subtraction();
		m.multiplication();

	}
}





