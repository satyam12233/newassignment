//Write a program in java to generate an abstract class A also class B inherits the class A. generate the object for

//class B and display the text “call me from B”.

package sept8.demo;
 abstract class A{
	abstract void show();
}
	class B extends A{
		void show() {
		System.out.println(" Call Me B ");
	}
	}
public class Abstract {
	public static void main(String arg[]) {
		B baseB = new B();
		baseB.show();
}

}
