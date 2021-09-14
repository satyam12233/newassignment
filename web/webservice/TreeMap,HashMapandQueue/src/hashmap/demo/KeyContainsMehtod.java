//7. Write a Java program to test if a map contains a mapping for the specified key. 

package hashmap.demo;
import java.util.HashMap;
import java.util.Map;

public class KeyContainsMehtod {
	public static void main(String[] args) {
		  Map<Integer,String> map = new HashMap<Integer,String>();
	        map.put(1,"Yellow");
	        map.put(2,"Green");
	        map.put(3,"Grey");
	        System.out.println("The Map Is : " +map);
	        System.out.println("1. Is key 'Yellow' exists?");
	        
	        // map contains a mapping for the specified key or not
	        
	        if(map.containsKey(1)) {
	        	System.out.println("yes!exist - " + map.get(1));
	        	
	        	// key exists
	        } else {
	         //key does not exists
	         System.out.println("no!");
	        }
	        }
		
		
	}

