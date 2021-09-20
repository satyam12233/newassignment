package methods.demo;
import java.awt.Rectangle;

import methods.demo.triangle.square;
class Shape1{
	void draw() {
		System.out.println("Drawing");
	}
	void erase() {
		System.out.println("Erase");
	}
}

class circle extends Shape1 {
	void draw() {
		System.out.println("Draw Class for circle :");
	}
	void erase() {
		System.out.println("Erase Class For Circle");
	}
	
}
class triangle extends circle{
	void draw() {
		System.out.println("Draw Class for triangle :");
	}
	void erase() {
		System.out.println("Erase Class For triangle");
	}
}

class square extends triangle{
		void draw() {
			System.out.println("Draw Class for sqaure :");
			super.draw();
		}
		void erase() {
			System.out.println("Erase Class For square");
			super.erase();
		}
	}

public class Inheritence{
	public static void main(String arg[]){
		/*Shape1 s1,s2,s3; 
		//s1 = new circle();
		//s2 = new triangle();
		//s3 = new square();
		//s1.draw();
		//s1.erase();
		s2.draw();
		s2.erase();
		s3.draw();
		s3.erase();*/
		
	square s = new square();
	s.draw();
	s.erase();
	}
}

