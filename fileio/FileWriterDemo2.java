package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {
	public static void main(String args[]) throws IOException {
		
		FileWriter fw= new FileWriter("D://Sri5/hello.txt");
		
		fw.write(68); // Adding Single 
		fw.write('\n');
		fw.write("Srikanth, Venkat, Prasanthi and divya "); 
		fw.write('\n');
		char[] ch1={'a', 'b' , 'c','d'};
		fw.write(ch1);
		
		fw.flush();
		fw.close();
		
		
		
	}
}
