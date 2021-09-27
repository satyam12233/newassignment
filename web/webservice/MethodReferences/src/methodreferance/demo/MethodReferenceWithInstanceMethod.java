package methodreferance.demo;
interface Demo{
	void display(); 
}
class InstanceMethod{	
	public  void add() {
	System.out.println("Say");	
}

}
public class MethodReferenceWithInstanceMethod {
	
	public static void main(String[] args) {
		
		// method to call Instance method
		InstanceMethod instance = new InstanceMethod();
		Demo demo = instance::add;
		demo.display();
		
		// another method to call instance method 
		Demo demo1 = new InstanceMethod()::add;
		demo1.display();
	}	
}

