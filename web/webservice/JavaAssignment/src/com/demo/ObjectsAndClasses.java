//2 Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.
package com.demo;
class StudentDetails{
	
	int sam_rollNumber = 11;
	int john_rollNumber = 23;
	String sam_phNo = "8787868578";
	String john_phNo = "898697979";
	String sam_address = "Delhi";
	String john_address = "Noida";
}
public class ObjectsAndClasses {
	public static void main(String arg[]) {
		StudentDetails sam = new StudentDetails();
		StudentDetails john = new StudentDetails();
		System.out.println("Sam Roll Number - " +sam.sam_rollNumber);
		System.out.println("Sam Phone Number - " +sam.sam_phNo);
		System.out.println("Sam Address - " +sam.sam_address);
		System.out.println("John Roll Number - " +john.john_rollNumber);
		System.out.println("John Phone Number - " +john.john_phNo);
		System.out.println("John Address - " +john.john_address);
		
	}
}
