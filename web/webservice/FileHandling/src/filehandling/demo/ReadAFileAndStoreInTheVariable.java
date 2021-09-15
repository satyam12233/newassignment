//9. Write a java program to read a file line by line and store it into a variable.

package filehandling.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadAFileAndStoreInTheVariable {
	
	public static void main(String[] args) throws IOException {
		
		String storeValue = new String();
		BufferedReader b1 = null;
		
		try {
			b1 = new BufferedReader(new FileReader("D:/satyam.txt"));
			String file = b1.readLine();
			while(file!=null) {
				storeValue = storeValue + file;
				file = b1.readLine();
			}
				System.out.println(storeValue);
			
		}
		finally {
			b1.close();
		}
		
	}

}
