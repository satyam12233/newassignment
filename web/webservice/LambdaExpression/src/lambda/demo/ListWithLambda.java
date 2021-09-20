package lambda.demo;

import java.awt.List;
import java.util.ArrayList;

interface listname{
	String name(String n);
	
}

public class ListWithLambda {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		 
		        list.add("satyam");
		        list.add("vivek");
		        list.add("abhinav");
		        list.add("sahil");
		        
		list.forEach((n) -> System.out.println(n));
	}
}
