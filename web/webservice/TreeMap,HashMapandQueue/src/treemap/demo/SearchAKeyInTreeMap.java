// 3. Write a Java program to search a key in a Tree Map. 

package treemap.demo;

import java.util.TreeMap;

public class SearchAKeyInTreeMap {
	public static void main(String[] args) {
		
		TreeMap<Integer,  String> map = new TreeMap<Integer , String>();
		
		map.put(101, " Satyam");
		map.put(103, " Naveen");
		map.put(102, " Sachin");
		
		System.out.println("The map is : " +map);
		
		// searching a key on the map
		
		if(map.containsKey(101)) {
			System.out.println("The Key is Present In the Map");
		}
			else {
				System.out.println("The Key is not Present In the Map");
			}
		}
	}

