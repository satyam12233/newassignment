//Handle exception in number Problem statement: Get the input String from user and parse it to integer, 
//if it is not a number it will throw number format exception Catch it and print 
//"Entered input is not a valid format for an integer." or else print the square of that number. 
package sept9.demo;

import java.util.Scanner;

public class NumberFormatException1 {
	public static void main(String arg[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer or String " );
		String s = scanner.nextLine();
		
		try 
		{
		int i = Integer.parseInt(s);
		System.out.println("The square of the number is = " +i*i);
		System.out.println("The work has been done successfully ");
	
		}
		catch(NumberFormatException e)
		{
			System.out.println("Entered Input Is not a valid format for an integer "+e);
		}
	        main(arg);
	}    
       


}
