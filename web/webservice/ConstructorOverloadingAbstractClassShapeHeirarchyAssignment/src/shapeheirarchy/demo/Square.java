package shapeheirarchy.demo;

public class Square extends TwoDimensional {
	float areaOfSquare;
	 Square(float side1) {
		 super(side1);
		
	}
	 void getArea() {
		 areaOfSquare = getDimension1() * getDimension1();
		 System.out.println("Area Of Square = " +areaOfSquare);
	 }
}
