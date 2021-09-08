package shapeheirarchy.demo;

public abstract class ThreeDimensionalShape extends Shape12{
public ThreeDimensionalShape(float side1) {
	super(side1);
}
	public ThreeDimensionalShape(float length, float width , float height) {
		super(length , width , height);
}
	abstract void getArea();
	abstract void getVolume();
}

// creating class for cube
class Cube extends ThreeDimensionalShape{
	Cube(float radius){
		super(radius);
		
	}
	void getArea() {
	float areaOfCube = 6*(getDimension1() * (getDimension1()));
	System.out.println("Area Of Cube = " +areaOfCube);
	}
	void getVolume() {
		float volumeOfCube = (getDimension1()*getDimension1()*getDimension1());
		System.out.println("Volume Of Cube = " +volumeOfCube);
	}
}
//creating class for sphere
class Sphere extends ThreeDimensionalShape{
	Sphere(float radius){
		super(radius);
	}

void getArea() {
	float areaOfSphere = (4*(float)Math.PI)*getDimension1()*getDimension1();
	System.out.println("Area Of Sphere = " +areaOfSphere);
}
void getVolume(){
 float volumeOfSphere  = (((float)4.0/(float)3.0)*((float)Math.PI)*getDimension1() *getDimension1() *getDimension1());
	System.out.println("Volume Of Sphere = " +volumeOfSphere);
}
}
// creating class for a cuboid 
class Cuboid extends ThreeDimensionalShape{
	float length;
	float width;
	float height;
	Cuboid(float length , float width , float height){
		super(length , width , height);;
		
		this.length = dimension1;
		this.width = dimension2;
		this.height =dimension3;
		
	}
	
	void getArea() {
		float areaOfCuboid = ((float)2)*(length*width + width*height + height * length);
		System.out.println("Area Of Cuboid = " +areaOfCuboid);
	}
	void getVolume() {
		float volumeOfCuboid = (length * width * height);
		System.out.println("Volume Of Cuboid = " +volumeOfCuboid);
	}
}