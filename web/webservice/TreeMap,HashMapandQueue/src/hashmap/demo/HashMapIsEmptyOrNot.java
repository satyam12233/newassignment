package hashmap.demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapIsEmptyOrNot {
	public static void main(String[] args) {
	      
		Map<Integer , String> map = new LinkedHashMap<Integer , String>();
		  map.put(1, "Red");
		  map.put(2, "Green");
		  map.put(3, "Black");
		  map.put(4, "White");
		  map.put(5, "Blue");
		  
		  System.out.println("Print the Map : " +map);
		  
		  // checking the map is empty or not
		  
		  boolean hashMap = map.isEmpty();
		  System.out.println("Is Map is Empty ? : " +hashMap);
		  
		  // Removing all the elements from the linked map
		  
		 map.clear();
		 
		// check if map is empty
		 
		 hashMap = map.isEmpty();
		 System.out.println("Is Map is Empty ? = "+hashMap);
				 
		  
		  
	}
}
