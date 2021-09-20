//1. Write a Java program to get a list of all file/directory names from the given. 

package filehandling.demo;

import java.io.File;

public class GetAllTheFiles {
	
	public static void main(String[] args) {
		
		File file = new File("C:/");
		String[] filelist = file.list();
		
		for(String name:filelist) {
		
		System.out.println(name);
	}

}
}