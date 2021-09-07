//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.
package com.demo;
class Triangle{
	int side1 = 3;
	int side2 = 4;
	int side3 = 5;	
}   
public class AreaOfTriangle {
	
	public static void main(String arg[]) {
		
		Triangle t1 = new Triangle();
		int perimeter = (t1.side1+t1.side2+t1.side3);
		System.out.println("Perimeter Of Triangle = " +perimeter);
	// semiperimeter
		int semiperimeter = (perimeter/2);
// area of triangle		
		int areaOfTriangle = ((((semiperimeter*(semiperimeter-t1.side1))*(semiperimeter-t1.side2))*(semiperimeter-t1.side3)));
		
		int area = (int)Math.sqrt(areaOfTriangle);
		
		System.out.println("Area of Triangle = " +area);
		
		
	}

}
