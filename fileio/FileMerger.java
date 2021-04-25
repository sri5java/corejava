package fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMerger {
	//merge data from 2 files into a 3rd file 
	
	@SuppressWarnings("resource")
	public static void main(String args[]) throws IOException{
		
//		PrintWriter pw = new PrintWriter("D://Sri5/abc.txt");
//		
//		FileReader fr = new FileReader("D://Sri5/file1.txt");
//		BufferedReader br= new BufferedReader(fr);
//		
//		String line = br.readLine();
//		
//		while (line !=null){
//			pw.println(line);
//			line =br.readLine();
//			
//		}
//		
//		br = new BufferedReader(new FileReader("D://Sri5/file2.txt"));
//		line = br.readLine();
//		
//		while(line !=null){
//			pw.println(line);
//			line = br.readLine();
//		}
//		
//		pw.flush();
//		br.close();
//		pw.close();
		
		
		
		PrintWriter pw = new PrintWriter("D://Sri5/abc.txt");
		
		FileReader fr = new FileReader("D://Sri5/file1.txt");
		BufferedReader br= new BufferedReader(fr);
		
		
		FileReader fr1 = new FileReader("D://Sri5/file2.txt");
		BufferedReader br1= new BufferedReader(fr1);
		
		String line1= br.readLine();
		String line2 = br1.readLine();
		
		
		while((line1 !=null || line2 !=null)){
			if(line1 != null){
				pw.println(line1);
				line1=br.readLine();
			}
			
			if(line2 != null){
				pw.println(line2);
				line2= br1.readLine();
			}
		}
		
		
		
		pw.flush();
		br.close();
		br1.close();
		pw.close();
	}
}
