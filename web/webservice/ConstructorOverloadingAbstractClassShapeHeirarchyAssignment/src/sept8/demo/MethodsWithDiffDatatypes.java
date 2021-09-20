//Write a Java Program to demonstrate the Method Overloading with difference in datatypes of parameters.
package sept8.demo;
class Method{
	
	
void show(double rollNumber , String name ) {
  System.out.println(rollNumber+""+name);
}

void show(int id , short num) {
	System.out.println(id+""+num);
}
}
public class MethodsWithDiffDatatypes {

	public static void main(String arg[]) {
		Method method = new Method();
		method.show(2, " naveen");
		method.show(12, "34");
	}
}
