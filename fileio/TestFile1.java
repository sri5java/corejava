package fileio;

// To display the names of all files and sub directories :

import java.io.File;
import java.io.IOException;

public class TestFile1 {
	public static void main(String args[]) {
		int count = 0;

		// Text File creation
		
		File f = new File("D://sri.txt");
		System.out.println(f.exists());

		try {

			f.createNewFile();
			System.out.println(f.exists());
			System.out.println(f.length());
//			System.out.println(f.delete());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Directory creation
		File f1 = new File("D://Sri5");
		System.out.println(f1.exists());
		f1.mkdir();
		System.out.println(f1.exists());
//
		
		File f2 = new File("D://Sri5", "abc.txt");
		System.out.println(f2.exists());
//
		try {
			f2.createNewFile();
			System.out.println(f2.exists());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//
//
		String[] s = f1.list();
//
		for (String s1 : s) {
			count++;
			System.out.println(s1);
		}
//
		System.out.println("The Total Number : " + count);
	}
}
