package declarationsandaccessmodifiers;

import java.io.*;

class PersistExample {
	public static void main(String args[]) throws Exception {
		TransientTest s1 = new TransientTest(211, "ravi", 22);// creating object
		// writing object into file
		FileOutputStream f = new FileOutputStream("D:\\f.txt");
		ObjectOutputStream out = new ObjectOutputStream(f);
		out.writeObject(s1);
		out.flush();

		out.close();
		f.close();
		System.out.println("success");
	}
}