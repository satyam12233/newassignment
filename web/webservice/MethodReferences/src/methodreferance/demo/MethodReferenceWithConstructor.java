package methodreferance.demo;

interface animal{
	
	void show(String name);
}
class Lion{
	
	Lion(String name){
		System.out.println(name);
	}
}
public class MethodReferenceWithConstructor{
	public static void main(String[] args) {
		
		animal h1 = Lion::new;
		h1.show("Satyam");
	}
}