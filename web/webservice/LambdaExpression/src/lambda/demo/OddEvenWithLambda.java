//PerformOperation isOdd(): The lambda expression must return true if a number is odd or  if it is even.

package lambda.demo;

interface CheckOddEven{
	int isOdd(int num);
}
	public class OddEvenWithLambda {
	    public static void main(String args[]) {
	        
	        CheckOddEven checkoddeven=(num)->{
	            
	            if(num%2==0) {
	                return 0;
	            }
	            else {
	               return 1;
	            }
	        };
	        int result,num=5;
	        result=checkoddeven.isOdd(num);
	        if(result==0) {
	            System.out.println("The given number is even = "+num);
	        }
	        else {
	            System.out.println("The given number is odd = "+num);
	        }
	        
	    }

	 

	}
		
		
	
