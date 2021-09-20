//2. Write a Java program to count the number of key-value (size) mappings in a map. 

package hashmap.demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountTheNumberOfKeys {
	public static void main(String[] args) {
	
		Map<Integer, String> map = new  LinkedHashMap<Integer , String>();
		map.put(1, "Satyam");
		map.put(2, "Sachin");
		map.put(3, "Naveen");
		
		System.out.println("The Size Of the Map is  : " +map.size());
	}
}