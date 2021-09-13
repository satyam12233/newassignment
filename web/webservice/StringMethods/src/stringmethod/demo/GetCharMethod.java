package stringmethod.demo;

public class GetCharMethod {
	public static void main(String[] args) {
		
		String S1 = "Javapoint";
		char[] ch = new char[10];
		try 
		{
		S1.getChars(1, 34, ch, 23);
		System.out.println(ch);
		
	}  
		catch(Exception e) {
		System.out.println(e);
	}

	}
	
	}