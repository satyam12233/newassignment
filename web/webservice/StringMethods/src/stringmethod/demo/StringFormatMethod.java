package stringmethod.demo;

public class StringFormatMethod {
	public static void main(String arg[]) {
		
		String name  = "java point";
		
		String Sf1 = String.format("name is %s",name);
		String Sf2 = String.format("value is %f",32.33333 );
		
		System.out.println(Sf1);
		System.out.println(Sf2);
	}
}
