//2. Write a Java program to copy a Tree Map content to another Tree Map. 

package treemap.demo;

import java.util.TreeMap;

public class CopyingATreeMapIntoAnother {
	
	public static void main(String[] args) {
		
TreeMap<Integer,  String> map1 = new TreeMap<Integer , String>();
		
		map1.put(101, " Satyam");
		map1.put(103, " Naveen");
		map1.put(102, " Sachin");
		
		System.out.println("The map 1 is : " +map1);
		
		// creating another Tree Map and copying the content of the map
		
		TreeMap<Integer,  String> map2 = new TreeMap<Integer , String>();
		map2.put(104, "Vivek");
		map2.put(105, "Sahil");
		
		System.out.println("The Map 2 is " +map2);
		
		map1.putAll(map2);
		System.out.println("The New Copied  Map is : " +map1);
	}

}
