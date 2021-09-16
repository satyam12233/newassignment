//Write a java program in which you will declare two interface sum and Add inherits these interface through class A1
//and display their content.

package sept9.demo;
import sept9.demo.A1;
import sept9.demo.add;
import sept9.demo.sum;

interface sum{

public 	int addition();
	
	}	
interface add extends sum{
public	int addition1();	
}
class A1 implements add{

	@Override
	public int addition() {
		int num1 = 4;
		int num2 = 3;
		int num = num1+num2;
		return num;
	}

	@Override
	public int addition1() {
		int num1 = 6 ;
		int num2 = 4;
		int num = num1+num2;
		return num;
	}
}
public class InterfaceDemo{
	public static void main(String arg[]) {
		 add a = new A1();
		int b =  a.addition();
		 System.out.println("THe summation of the number is "+b);
		int c =  a.addition1();
		System.out.println("The addition of the number is "+c);
		 
	}
	
}