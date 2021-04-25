package declarationsandaccessmodifiers;

import java.io.*;

class DePersist {
	public static void main(String args[]) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\f.txt"));
		TransientTest s = (TransientTest) in.readObject();
		System.out.println(s.id + " " + s.name + " " + s.age);
		in.close();
	}
}
