package fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileExtraction {
	public static void main(String args[]) throws Exception{
		
		PrintWriter pw = new PrintWriter("D://Java/output.txt");
		
		BufferedReader br1= new BufferedReader(new FileReader("D://Java/input.txt"));
		
		String line = br1.readLine();
		
		while(line != null){
			boolean available = false;
			
			BufferedReader br2 = new BufferedReader(new FileReader("D://Java/delete.txt"));
			
			String target = br2.readLine();
			
			while(target != null){
				if(line.equals(target)){
					available = true;
					break;
					
				}
				
				target= br2.readLine();
			}
			
			if(available == false){
				pw.println(line);
			}
			
			line = br1.readLine();
			br2.close();
		}
		pw.flush();
		
		br1.close();
		
	}
	
}

			