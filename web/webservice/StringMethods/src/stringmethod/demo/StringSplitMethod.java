package stringmethod.demo;

public class StringSplitMethod {
	public static void main(String[] args) {
		
		String S1 = "Javapoint is a good website";
		String[] w = S1.split("s");
		for(String s:w) {
			System.out.println(s);
		}
		
		
	}
}
