package mainclass.demo;

import addtiton.demo.AdditionService;
import division.demo.DivisionService;
import evenodd.demo.EvenOddService;
import multiplication.demo.MultiplicationService;
import subtraction.demo.SubtractionService;

public class MainClass {
	public static void main(String arg[]) {
		
		// creating object for addition
		AdditionService additionService = new AdditionService();
		int add =additionService.display(2, 3);
		System.out.println("Addition Of the number is = " +add);
		
		// creating object for subtraction
		
		SubtractionService subtractinService = new SubtractionService();
		int sub = subtractinService.showSubtraction(3, 1);
		System.out.println("Subtraction Of the Number is = " +sub);
		
		// creating object for multiplication
		
		MultiplicationService multiplicationService = new MultiplicationService();
		int multiply = multiplicationService.showMultiplication(5, 2);
		System.out.println("Multiplication of the number is = " +multiply);
		
		// creating object for division
		
		DivisionService divisionService = new DivisionService();
		int division = divisionService.showDivision(8, 2);
		System.out.println("Division Of the number is =" +division);
		
		// creating object for even and odd
		
		EvenOddService evenOddServices = new  EvenOddService();
		String evenodd =evenOddServices.showEvenOdd(5);
		System.out.println("Check Even or Odd : " +evenodd);
			
					
				}
		


		
		
	}


