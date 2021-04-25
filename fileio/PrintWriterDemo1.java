package fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo1 {
	public static void main(String[] args) throws IOException{
		
		FileWriter fw = new FileWriter("D://Sri5/abc.txt");
		PrintWriter out = new PrintWriter(fw);
		
//		PrintWriter out = new PrintWriter("D://Sri5/abc.txt");
		
		out.write(100);
		
		out.println(100);
		out.println(true);
		out.println('c');
		out.println("srikanth");
		out.flush();
		out.close();
	}
}
