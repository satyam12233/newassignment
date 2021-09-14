//3. Write a Java program to copy all of the mappings from the specified map to another map. 

package hashmap.demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class CopyMapping {
	public static void main(String[] args) {
		 
		// creating map 1
		Map<Integer , String> map1 = new LinkedHashMap<Integer , String>();
		map1.put(1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		System.out.println("Values in first map: " +map1);
		
		//creating map2
		Map<Integer , String> map2 = new LinkedHashMap<Integer , String>();
		  map2.put(4, "White");
		  map2.put(5, "Blue");
		  map2.put(6, "Orange");
		  System.out.println("Values in second map: " +map2);
		  
		  // copying the elements of a map into another
		  
		  map1.putAll(map2);
		  System.out.println("The New Map is: " +map1);
	}
}
