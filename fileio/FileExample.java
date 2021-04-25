package fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileExample {
	public static void main(String[] args) throws IOException {
		  // TODO Auto-generated method stub
		  File f = new File("D://Prashanti");
		  f.mkdir();
		  //File f1 =new File(“Sri5”, “demo.txt”);
		  File f1 = new File(f,"first.txt");
		  f1.createNewFile();
		  File f2= new File(f,"second.txt");
		  f2.createNewFile();
		        PrintWriter out = new PrintWriter(f1);
		  out.println("Srikant");
		  out.println("Prashanti");
		  out.println("Divya");
		  out.println("Venkat");
		  out.println("700650256");
		  out.println("700650257");
		  out.println("700650258");
		  out.println("700650259");
		  out.flush();
		  out.close();
		        PrintWriter out1 = new PrintWriter(f2);
		  out1.println("700650256");
		  out1.println("700650257");
		  out1.println("700650258");
		  out1.println("700650259");
		  out1.flush();
		  out1.close();
		  File f3 = new File(f,"third.txt");
		  f3.createNewFile();
		  
		  FileReader fr= new FileReader(f1);
		  BufferedReader br = new BufferedReader(fr);
		  PrintWriter out3= new PrintWriter(f3);
		  
		  String line = br.readLine();
		  
		  while(line != null){
		   out3.println(line);
		   line = br.readLine();
		  }
		 
//		  br.close();
		  FileReader fr1= new FileReader(f2);
		  BufferedReader br1 = new BufferedReader(fr1);
		        String line1 = br1.readLine();
		  
		  while(line1 != null){
		   out3.write(line1);
		   line1 = br1.readLine();
		  }
		  
		  while(line!=null)
		  {
		   if(line.equals(line1))
		    System.out.println();
		   else
		    System.out.println(line);
		  }
		  
//		  out.flush();
//		  out1.flush();
//		  out3.flush();
		  br.close();
		  br1.close();
		  out3.close();
	}
}
