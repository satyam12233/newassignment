//7 . Write a Java program to read a file content line by line.

package filehandling.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFileLineByLine {
	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader file = new FileReader("D:\\satyam\\newassignment\\web\\webservice\\StudentInfo\\src\\main\\java\\com\\StudentService.java");
		
		BufferedReader b = new BufferedReader(file);
		
		try {
			
			
		 String d1 = b.readLine();
		 while(d1!=null) {
			 d1 = b.readLine();
			System.out.println(d1);
		 }	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		  finally {
		         try {
		             b.close();
		         } catch (IOException e) {
		             // TODO Auto-generated catch block
		             e.printStackTrace();
			
		}
	}
	}
}