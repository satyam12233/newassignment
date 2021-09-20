//Write a Java Program to demonstrate the Method Overload ing w ith different numbers of parameters in argument list.

package sept8.demo;
class Constructor{

 
	void display(String id) {
	System.out.println( id+"");
	}
    
  
	  void display(int rollNumber , String name){
	System.out.println(rollNumber+""+name);
  }
  }
  
public class MethodOverloadingWithDifferentParameters {
	public static void main(String arg[]) {
		Constructor a1 = new Constructor();
		a1.display("satyam");
		Constructor a2 = new Constructor();
		a2.display(12, " Satyam");
		
	}
}
