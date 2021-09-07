// Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
package com.demo;


class Student{
	
	String showResult() {
		String name = "Satyam";
		
		return name;	
	}
	int showResult1() {
		int rollNumber = 23;
		return rollNumber;
	}
}
public class ReturnDetails{
		public static void main(String arg[]) {
			Student showdetails = new Student();
			Student showdetails1 = new Student();
			int rollNumber = showdetails.showResult1();
			String name = showdetails1.showResult();
			System.out.println("name " +name);
			System.out.println("roll number " +rollNumber);
		}
		
}