// 9. Write a Java program to create a set view of the mappings contained in a map. 

package hashmap.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SetViewOfAMapping {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Red");
		map.put(2, "Blue");
		map.put(3, "Black");
		
		System.out.println("The map is : " +map);
		
		// creating a set view
		
		Set set = map.entrySet();
		System.out.println("The Map after creating set values are" +set);
		
		
	}

}
