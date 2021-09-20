//PerformOperation isPrime(): The lambda expression must return  true if a number is prime

package lambda.demo;
interface prime{
	int  primenumber(int a1);
	
}
public class PrimeNumberWithLambda {
	public static void main(String[] args) {
		
		prime p1 = (a1) -> {
			for (int i=2;i<a1;i++);
			  
            int i = 2;
			if(a1%i==0) {
                return 0;
            }
            else {
               return 1;
            }
        };
        int result,a1=  45;
        result = p1.primenumber(a1) ;
        if(result == 0) {
        	System.out.println("The number is not prime " +a1);
        	
        }
        else {
        	System.out.println("The number is  prime " +a1);
        }
		}
	
}
