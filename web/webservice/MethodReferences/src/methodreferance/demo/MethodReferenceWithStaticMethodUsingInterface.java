//method reference with static method 

package methodreferance.demo;

interface Animal{
	void demo();
	
}
class AnimalBehaviour{
	public static void run() {
		System.out.println("Cat Is Running");
	}
	
	public static void dog() {
		System.out.println("Dog Is barking");
		}
	public static void lion() {
		System.out.println("Lion is the king");
	}
	
}
		public class MethodReferenceWithStaticMethodUsingInterface {
			public static void main(String[] args) {
				
				Animal animal = AnimalBehaviour::run;
				animal.demo();
		
				Animal animal1 = AnimalBehaviour::dog;
				animal1.demo();
				
				Animal animal2 = AnimalBehaviour::lion;
				animal2.demo();
		
			}
		}
		


