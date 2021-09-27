// Method reference with static method using bi functional interface

package methodreferance.demo;

import java.util.function.BiFunction;

class ArithmeticOperation{
	
	public static int add(int a , int b) {
		return a+b;
	}
	
	public static int subtract(int a , int b) {
		return a-b;
	}
	
	public static int multiply(int a , int b) {
		return a * b;
		
	}
	public static double division(double a , double b) {
		return a/b;
	}
}


public class MethodReferenceWithStaticMethod {
	public static void main(String[] args) {
		//creating bi functional interface for refering methods
		BiFunction<Integer, Integer, Integer> adding =  ArithmeticOperation::add;
		int result1 = adding.apply(12, 20);
		
		BiFunction<Integer, Integer, Integer> subtracting =  ArithmeticOperation::subtract;
		int result2 = subtracting.apply(30, 22);
		
		BiFunction<Integer, Integer, Integer> multipying =  ArithmeticOperation::multiply;
		int result3 = multipying.apply(4, 5);
		
		BiFunction<Double, Double, Double> dividing = ArithmeticOperation::division;
		double result4 = dividing.apply(100.00,5.00);
		
		
		System.out.println("The additon of two number is = " +result1);
		System.out.println("The subtraction of two number is = " +result2);
		System.out.println("The multiplication of two number is = " +result3);
		System.out.println("The division of two number is = " +result4);
	}
		
}
      