package shapeheirarchy.demo;
public abstract class Shape12{
	float dimension1;
	float dimension2;
	float dimension3;
	// getter and setter
	public float getDimension1() {
		return dimension1;
	}
	public void setDimension1(float dimension1) {
		this.dimension1 = dimension1;
	}
	public float getDimension2() {
		return dimension2;
	}
	public void setDimension2(float dimension2) {
		this.dimension2 = dimension2;
	}
	public float getDimension3() {
		return dimension3;
	}
	public void setDimension3(float dimension3) {
		this.dimension3 = dimension3;
	}
	
	//Single Parameter Constructor
	public Shape12(float side1) {
		this.dimension1= side1;
	}
	//Two Parameterized Constructor
	
	public Shape12(float side1 , float side2) {
		this.dimension1 = side1;
		this.dimension2 = side2;
	}
	// Three Parameterized Constructor
	public Shape12(float side1 , float side2,float side3) {
		this.dimension1 = side1;
		this.dimension2 = side2;
		this.dimension3 = side3;
	}
}



