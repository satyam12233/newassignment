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
class triangle extends Shape1{
	void draw() {
		System.out.println("Draw Class for triangle :");
	}
	void erase() {
		System.out.println("Erase Class For triangle");
	}
}
class square extends Shape1{
		void draw() {
			System.out.println("Draw Class for sqaure :");
		}
		void erase() {
			System.out.println("Erase Class For square");
		}
	}

public class Shape{
	public static void main(String arg[]){
		Shape1 s = new triangle();
		s.draw();
		s.erase();
		
		s= new circle();
		s.draw();
		s.erase();
		s=new square();
		s.draw();
		s.erase();
		
	}
}
