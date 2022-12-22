package lab9;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Printer {
	File file; 

	public Printer(String fileName) throws Exception{
			this.file = new File(fileName);
	}
	
	public void printLinesWhichContain(String word) {
		try {
			Scanner reader = new Scanner(this.file);
			
			while(reader.hasNext()) {
				String line = reader.next(); 
				
				if(line.contains(word)) {
					System.out.println(line);
				}
			}	
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found");
		}
	}
	

}
