//5. Write a Java program to get all keys from the given a Tree Map. 


package treemap.demo;

import java.util.Set;
import java.util.TreeMap;

public class GetAllKeyMethod {
	
	public static void main(String[] args) {
		
		TreeMap<Integer,  String> map = new TreeMap<Integer , String>();
		

		map.put(101, " Satyam");
		map.put(103, " Naveen");
		map.put(102, " Sachin");
		map.put(105, " Vivek");
		map.put(104, " Harshit");
		
		System.out.println("The Map is : " +map);
		
		// getting all the keys from  the tree map
		
		Set<Integer> key = map.keySet();
		System.out.println("The keys are : "+key);
		
	}

}
