package lambda.demo;
interface addtion{
	int add(int a , int b);
}
public class AdditionWithLambda {
	
	public static void main(String[] args) {
		
		addtion a1 = (a,b) -> (a+b);
		System.out.println(a1.add(40, 60));
		}
 	}


