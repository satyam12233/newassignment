package stringmethod.demo;

public class ContainsMethod {
	public static void main(String arg[]) {
		
		String name = "Welcome to Java Point";
		System.out.println(name.contains("Java"));
		System.out.println(name.contains("Java Point"));
		System.out.println(name.contains("String")); // it is false because it is not present in the sequence of the string
	}
}
