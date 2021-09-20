package hashmap.demo;

import java.util.HashMap;
//8. Write a Java program to test if a map contains a mapping for the specified value. 

import java.util.Map;

public class ContainsValueMethod {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
	    map.put(1,"Yellow");
	    map.put(2,"Green");
	    map.put(3,"Grey");
	    System.out.println("The Map Is : " +map);
	    System.out.println("1. Is value 'Yellow' exists?");
	    
	    // map contains a mapping for the specified value or not
	    
	    if(map.containsValue("Yellow")) {
	    	System.out.println("yes!exist -");
	    	
	    	// value exists
	    } else {
	     //key does not exists
	     System.out.println("no!");
	    }

	}

	}
	
	