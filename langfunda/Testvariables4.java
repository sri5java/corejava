package langfunda;

public class Testvariables4 {
	int x = 10;
	static int y = 90;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Testvariables4 t4 = new Testvariables4();

		t4.x = 888;
		t4.y = 999;

		System.out.println("X value : " + t4.x + "    " + "Y Value : " + t4.y);

		Testvariables4 t5 = new Testvariables4();
		t5.x = 100;
		t5.y = 70;

		System.out.println("X value of T5 : " + t5.x + " " + "Y value of T5 : " + t5.y); // 10
																							// 90

		Testvariables4 t6 = new Testvariables4();

		System.out.println("X value of T6 : " + t6.x + " " + "Y value of T6 : " + t6.y);

	}

}
