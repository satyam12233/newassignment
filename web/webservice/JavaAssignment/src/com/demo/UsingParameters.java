package com.demo;
 class areaTriangle{
	 
	 float getareaOfTriangle(float side1,float side2,float side3) {
		 float semiperimeter,areaOfTriangle;
		 semiperimeter=(side1+side2+side3)/2;
		 areaOfTriangle = (float)Math.sqrt(semiperimeter*(semiperimeter-side1)*(semiperimeter-side2)*(semiperimeter-side3));
		 return areaOfTriangle;
	 }
   float getPerimeterOfTriangle(float side1,float side2 , float side3) {
   return (side1+side2+side3);
}
 }
public class UsingParameters{
	public static void main(String arg[]) {
		areaTriangle getAreaTriangle = new areaTriangle();
		areaTriangle getperimeter = new areaTriangle();
		float areaOfTriangle =  getAreaTriangle.getareaOfTriangle(3, 4, 5);
		float perimeterOfTriangle = getperimeter.getPerimeterOfTriangle(3,4,5);
		System.out.println("Perimeter Of Tiangle = " +perimeterOfTriangle);
		System.out.println("Area Of Triangle = " +areaOfTriangle);
	}
}