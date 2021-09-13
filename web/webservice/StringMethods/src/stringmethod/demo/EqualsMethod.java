package stringmethod.demo;

public class EqualsMethod {
	public static void main(String arg[]) {
		
	String s1="satyam";  
	String s2="satyam";  
	String s3="JAVATPOINT";  
	String s4="python";  
	System.out.println(s1.equals(s2));//true because content and case is same  
	System.out.println(s1.equals(s3));//false because case is not same  
	System.out.println(s1.equals(s4));//false because content is not same  
	}
}
