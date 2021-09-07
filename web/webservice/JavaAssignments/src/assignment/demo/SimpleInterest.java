package assignment.demo;

public class SimpleInterest {
	
	public static void main(String arg[]) {
		
		//variable declaration
		
		float principalamount = (float) 20000.00;
		float rate = (float) 12.3;
		float time = (float) 2.00;
		
		// temp 
		
		float temp = (principalamount*rate*time)/100;
		
		System.out.println("Simple Interest = " +temp);
	}

}
