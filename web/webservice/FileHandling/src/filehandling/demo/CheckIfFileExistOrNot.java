// 3. Write a Java program to check if a file or directory specified by pathname exists or not. 


package filehandling.demo;
import java.io.File;
import java.io.FilenameFilter;

public class CheckIfFileExistOrNot {
	public static void main(String[] args) {
		
		File file = new File("D:/");
		
		String[] filename = file.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				if (name.endsWith(".txt")){
					return true;
				}	
					else {
						return false;
					}
					
				}	
		});
		for(String filename1:filename) {
			System.out.println(filename1);
		}
	}

}
