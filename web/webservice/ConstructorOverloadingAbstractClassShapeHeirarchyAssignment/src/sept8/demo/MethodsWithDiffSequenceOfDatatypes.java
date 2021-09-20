//Write a Java Program to demonstrate the Method Overloading by changing the sequence of datatypes of arguments.
package sept8.demo;
class Overloading{
	
void sequence(int id , String name) {
	System.out.println(id+""+name);
}

void sequence (String name , int id) {
	System.out.println(name+""+id);
}
}
public class MethodsWithDiffSequenceOfDatatypes {
	public static void main(String arg[]) {
		Overloading methods = new Overloading();
		methods.sequence(12, " Satyam");
		methods.sequence("Satyam ", 12);
	}

}
