package com.demo;

import java.util.Scanner;
 class RectangleArea {
	double length;
	double breadth;
	
	RectangleArea(double len, double brea) {
		length = len;
		breadth = brea;
	}

	double returnArea() {
		return length * breadth;
	}
}

public class AreaOfRectByOneMethod {
	public static void main(String arg[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Length in double :");
		double length = scanner.nextDouble();
		System.out.println("Enter Breadth in double : ");
		double breadth = scanner.nextDouble();
		
		RectangleArea area = new RectangleArea(length, breadth);
		System.out.println("Area Of Rectangle = " + area.returnArea());
		
		main(arg);
	}
}
