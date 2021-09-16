// PerformOperation isPalindrome(): The lambda expression must return true if a number is a palindrome or  if it is not.

package lambda.demo;

interface Palindrome{
	int palindrome(int num);
}
public class PalindromeNumberWithLambda {
	public static void main(String[] args) {
		
		Palindrome p1 = (num)-> {
			int rev = 0;
			int temp = num;
			while(temp>0) {
			int result = temp%10;
			rev = rev*10 + result;
			temp = temp / 10;
			}
			return rev;
		};
		
		int   rev1 , num1= 230;
		rev1=  p1.palindrome(num1);
		if(rev1== num1 ) {
		System.out.println("The number is palindrome " +num1);
	}
	else {
		System.out.println("The number is not palindorme " +num1);
}
		}
	}
	
		