//8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map. G

package treemap.demo;

import java.util.TreeMap;

public class GreatestAndLeastKeyMethod {
	public static void main(String[] args) {
		
TreeMap<Integer,  String> map = new TreeMap<Integer , String>();
		
		map.put(101, " Satyam");
		map.put(103, " Naveen");
		map.put(102, " Sachin");
		map.put(105, " Vivek");
		map.put(104, " Harshit");
		
		System.out.println("The map is : " +map);
		
		//for greatest key value
		
		System.out.println("Greatest Key Value is : " +map.lastEntry());
		
		// for least key value
		
		System.out.println("Lowest Key Value is : " +map.firstEntry());
	}

}
