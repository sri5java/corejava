package exceptionhandling;

public class TestExp9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		System.out.println(10 / 0);
		
		try {
			System.out.println(10 / 0);
//			System.out.println("try");

		} catch (Exception e) {
			System.out.println("catch");
//			e.printStackTrace();
//			System.out.println(e.toString());
			System.out.println(e.getMessage());

		}

		System.out.println("Step 1");
		System.out.println("Step 2");
		System.out.println("Step 3");
		System.out.println("Step 4");

	}
}
