//4. Write a Java program to search a value in a Tree Map. 

package treemap.demo;

import java.util.TreeMap;

public class SearchByValueInTreeMap {
	public static void main(String[] args) {
		
		TreeMap<Integer,  String> map = new TreeMap<Integer , String>();
		
		map.put(101, "Satyam");
		map.put(103, "Naveen");
		map.put(102, "Sachin");
		
		System.out.println("The map is : " +map);
		System.out.println("101. Is value 'Satyam' exists?");
		
		// searching a key on the map
		
		if(map.containsValue("Satyam")) {
			System.out.println("The Value is Present In the Map");
		}
	
			else {
				System.out.println("The Value is not Present In the Map");
			}
		}
	

	
	}

	
	