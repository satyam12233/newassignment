package shapeheirarchy.demo;

public class Circle extends TwoDimensional{
	float areaOfCircle;
	Circle(float radius){
		super(radius);
	}
void getArea() {
	areaOfCircle = getDimension1()*getDimension1()*(float)Math.PI;
	System.out.println("Area Of Circle = " +areaOfCircle);
}
}
