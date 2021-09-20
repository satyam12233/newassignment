package stringmethod.demo;

public class EqualIgnoreCase {
	public static void main(String arg[]) {
		
		String name = "javapoint";
		String name1 = "JAVAPOINT";
		String name2 = "TutorialPoint";
		
		System.out.println(name.equalsIgnoreCase(name1));
		System.out.println(name.equalsIgnoreCase(name2));
		System.out.println(name1.equalsIgnoreCase(name));
		
	}
}
