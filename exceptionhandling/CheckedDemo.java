package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("D://File");
		f.exists();
//		f.createNewFile();

		try {
			FileReader file = new FileReader("somefile.txt");
		} catch (FileNotFoundException e) {
			// Alternate logic
			e.printStackTrace();
		}

	}

}
