package shapeheirarchy.demo;

public class ShapeMain {
public static void main(String arg[]) {
	// creating object for square 
	TwoDimensional twodimensionalShape1 = new Square((float)8);
	twodimensionalShape1.getArea();
	
	//creating object for circle
	
	TwoDimensional twoDimensionalShape2 = new Circle((float)9);
	twoDimensionalShape2.getArea();
	
	// creating object for triangle
	TwoDimensional twoDimensionalShape3 = new Triangle((float)9,(float)8);
	twoDimensionalShape3.getArea();
	
	// creating area  object for cube
	
	ThreeDimensionalShape threeDimensionalShape4 = new Cube((float)3);
	threeDimensionalShape4.getArea();
	// creating volume object for cube
	ThreeDimensionalShape threeDimensionalShape5 = new Cube((float)5);
	threeDimensionalShape5.getVolume();
	
	//creating object for area of sphere
	
	ThreeDimensionalShape threeDimensionalShape6 = new Sphere((float)3);
	threeDimensionalShape6.getArea();
	
	// creating object for volume of sphere
	
	ThreeDimensionalShape threeDimensionalShape7 = new Sphere((float)2);
	threeDimensionalShape7.getVolume();
	
	// creating object for area of cuboid 
	
	ThreeDimensionalShape threeDimensionalShape8 = new Cuboid((float)2,((float)1),((float)3));
	threeDimensionalShape8.getArea();
	
	// creating object for volume of cuboid
	
	ThreeDimensionalShape threeDimensionalShape9 = new Cuboid ((float)1,((float) 2),((float)3));
	threeDimensionalShape9.getVolume();
}}