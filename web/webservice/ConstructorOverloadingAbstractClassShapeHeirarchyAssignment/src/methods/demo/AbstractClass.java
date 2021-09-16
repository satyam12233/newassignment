package methods.demo;
abstract class Bank{
abstract	 int getInterest();
}
class SBI extends Bank{
	int getInterest (){
	return 7;
	}	
}
class PNB extends Bank{
	int getInterest() {
		return 8;
	}
}
public class AbstractClass{
	public static void main(String arg[]) {
		
		Bank b = new SBI();
		b.getInterest();
		System.out.println("The interest of SBI " +b.getInterest());
		b = new PNB();
		b.getInterest();
		System.out.println("The interest of PNB " +b.getInterest());		
	}
}