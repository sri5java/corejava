package fileio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferedWriterDemo {
	public static void main(String args[]) throws Exception {
		
		File f= new File("D://Sri5/abc.txt");
		f.createNewFile();
		
//		FileWriter fw= new FileWriter("D://Sri5/abc.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter("D://Sri5/abc.txt"));
		
		bw.newLine();
		bw.write(100);
		bw.newLine();
		
		char[] ch1={'a', 'b', 'c', 'd'};
		bw.write(ch1);
		bw.newLine();
		bw.write("Srikanth Info");
		bw.flush();
		bw.close();
	}
}
