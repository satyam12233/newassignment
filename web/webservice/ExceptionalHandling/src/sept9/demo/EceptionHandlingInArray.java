//Write a program that takes as input the size of the array and the elements in the array. 
//The program then asks the user to enter a particular index and prints the element at that index. 
//This program may generate Array Index Out Of Bounds Exception. Use exception handling mechanisms 
//to handle this exception. In the catch block, print the class name of the exception thrown.

package sept9.demo;

import java.util.Scanner;

public class EceptionHandlingInArray{
	public static void main(String arg[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of the array");
		int number = scanner.nextInt();
		
		int[] arr = new int[number]; // declaration of the array
		System.out.println("Enter the elements of array");
		
		for(int i=0;i<number;i++) {
			arr[i] = scanner.nextInt();
		}
		
		int number1 =scanner.nextInt();
		System.out.println("Enter the element you want to access" +number1);
		try
		{
			System.out.println(arr[number1]);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bound Exception Occurs");
		}
		
		
		main(arg);
	
	}

}
