package filehandling.demo;

// 5. Write a Java program to check if given pathname is a directory or a file. 

import java.io.File;

public class CheckIfGivenIsFileOrDirectory {
	
	public static void main(String[] args) {
		
		File file = new File("D:/data structure");
		
		if(file.isDirectory()) {
			System.out.println("It is a directory " +file.getAbsolutePath());
		}
		else {
			System.out.println("It is not a directory " +file.getAbsolutePath());
		}
		
		if(file.isFile()) {
			System.out.println("It is a file " +file.getAbsolutePath());
		}
		else {
			System.out.println("It is not a file " +file.getAbsolutePath());
		}
		
	}

}
