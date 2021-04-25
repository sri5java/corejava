package fileio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException{
		
//		File f =new File("D://Sri5/abc.txt");
//		FileReader fr=new FileReader(f);
//		
//		
//		char[] ch= new char[(int) f.length()];
//		fr.read(ch);
//		
//		for(char ch1: ch){
//			System.out.println("**" + ch1);
//		}
		
		FileReader fr1 = new FileReader("D://Sri5/abc.txt");
		int i= fr1.read();
		
		while(i !=-1){
			System.out.println((char)i +"***");
			i = fr1.read();
		}
		
		fr1.close();
//		fr1.close();
				
		
	}
}
