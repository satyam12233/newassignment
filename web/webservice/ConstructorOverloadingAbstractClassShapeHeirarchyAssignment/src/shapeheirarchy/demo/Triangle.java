package shapeheirarchy.demo;

public class Triangle extends TwoDimensional{
	float areaOfTriangle;
	public Triangle(float side1 , float side2) {
		super(side1 , side2);
		
	}
void getArea() {
	areaOfTriangle = (((float)0.5)*(getDimension1() * getDimension2()));
	System.out.println("Area Of Triangle = "+areaOfTriangle);
}
}
