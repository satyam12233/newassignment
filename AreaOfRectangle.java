package com.demo;
 class Rectangle{
	int Area(int length1,int breadth1){
		int areaOfRectangle1 = length1*breadth1;
		return areaOfRectangle1;
		
	}
	int Area1(int length2,int breadth2) {	
		int areaOfRectangle2 = length2*breadth2;
		return areaOfRectangle2;
 }			
	
 }	
 

public class AreaOfRectangle {
	public static void main(String arg[]) {
		Rectangle rect = new Rectangle();
		int r1= rect.Area(4, 5);
		int r2=rect.Area1(5, 8);
	    System.out.println("Area Of Rectangle 1 = " +r1);
	    System.out.println("Area Of Rectangle 2 = " +r2);
	}
}
