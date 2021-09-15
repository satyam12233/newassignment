package filehandling.demo;

//2 . Write a Java program to get specific files by extensions from a specified folder. 

import java.io.BufferedReader;
import java.io.FileReader;

public class GettingSpecificFile {
	
	public static void main(String[] args) {
		
		
		BufferedReader  b = null;
		try
		{
			b = new BufferedReader(new FileReader("D:\\data structure\\newassignment\\web\\webservice\\sep9\\InterfaceDemo.java"));
			
			String file = b.readLine();
			
			while(file!=null) {
				System.out.println(file);
				file=b.readLine();
			}
			
		}	
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
		
		
	}
	
}

