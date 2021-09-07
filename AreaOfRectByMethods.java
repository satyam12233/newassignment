package com.demo;

import java.util.Scanner;
class Area{
	double length;
	double breadth;
	void setDim(double len , double brea) {
		length = len;
		breadth = brea;
	}
	double getArea(){
		return length*breadth;
		
	}
}
public class AreaOfRectByMethods{
		public static void main(String arg[]) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter Length In Double :" );
			double length = scanner.nextDouble();
			
			System.out.println("Enter Breadth In Double :");
			double breadth = scanner.nextDouble();
			//area 
			Area area = new Area();
			area.setDim(length, breadth);
			System.out.println("Area Of Rectangle :" + area.getArea());
			
			main(arg);
		}
		
	}

