//8 . Write a Java program to read a plain text file. 


package filehandling.demo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrintAPlainText {
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("D:/satyam.txt");
		BufferedInputStream b1 = new BufferedInputStream(file);

			int i;
			
			while((i=b1.read())!=-1) {
			System.out.println((char)i);
			
				}
			
			
			file.close();
			b1.close();
}


}



