//4. Write a Java program to remove all of the mappings from a map. 
package hashmap.demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveTheMapping {
	public static void main(String[] args) {
		
		Map<Integer , String> map = new LinkedHashMap<Integer , String>();
		map.put(1, "Satyam");
		map.put(2, "Javapoint");
		map.put(3, "TutorialPoint");
		
		System.out.println("The Map is : " +map);
		
		// removing the mapping from the map
		
		map.clear();
		System.out.println("Print the Map : " +map);
		
		
		
	}

}
