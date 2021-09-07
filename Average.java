package com.demo;

import java.util.Scanner;  

class AverageOfNumber{
	double number1;
	double number2;
	double number3;
	
	 AverageOfNumber(double num1,double num2,double num3){
		 number1 = num1;
		 number2 = num2;
		 number3 = num3;
	}	 
		 double getAverage(){
		 return  (number1+number2+number3)/3;	
		 }
}
public class Average{
	public static void main(String arg[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number 1 = ");
		double number1 = scanner.nextDouble();
		System.out.println("Enter The Number 2 = ");
		double number2 = scanner.nextDouble();
		System.out.println("Enter The Number 3 = ");
		double number3 = scanner.nextDouble();
		
		AverageOfNumber average = new AverageOfNumber(number1,number2,number3);
		System.out.println("Average Of The Numbers = " +average.getAverage());
		
		main(arg);
	}
}