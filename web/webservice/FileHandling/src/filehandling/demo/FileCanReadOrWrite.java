//4. Write a Java program to check if a file or directory has read and write permission. 


package filehandling.demo;

import java.io.File;

public class FileCanReadOrWrite {
	
	public static void main(String[] args) {
		
		File file = new File("D:/satyam.txt");
		if(file.canWrite()) {
			System.out.println("File have the permission for read " +file.getAbsolutePath());
			
		}
		else {
			System.out.println("File do not have the permission " +file.getAbsolutePath());
		}
		
		if(file.canWrite()) {
			System.out.println("File have the permission to write " +file.getAbsolutePath());
			
		}
		else {
			System.out.println("File do not have permission to write " +file.getAbsolutePath());
		}
	}

}
