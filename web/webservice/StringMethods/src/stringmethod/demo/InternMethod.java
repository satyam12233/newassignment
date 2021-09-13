package stringmethod.demo;

public class InternMethod {
	public static void main(String[] args) {
		String S1 = new String("Javapoint");
		
		String S2 = S1.intern();
		
		String S3 = "Javapoint";
		
		System.out.println(S1==S2);
		System.out.println(S3==S2);
		
		System.out.println(S1==S3);
		
	}
}
