package shapeheirarchy.demo;

public abstract class TwoDimensional extends Shape12 {
	
	 TwoDimensional(float side1) {
		 super(side1);
	 }
	 TwoDimensional(float side1,float side2){
    	  super(side1,side2);
      }
abstract void getArea();
}


