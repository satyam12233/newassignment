//6 Write a Java program to read contents from a file into byte array. 

package filehandling.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ReadAContentFromAFile {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		byte[] byteArray = new byte[100];
		
		FileInputStream in = new FileInputStream("D:/satyam.txt");
		
		try
		{
			in.read(byteArray);
			 String data = new String(byteArray);
 
            System.out.println(data);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	      finally {
         try {
             in.close();
         } catch (IOException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
	}

	 }
}