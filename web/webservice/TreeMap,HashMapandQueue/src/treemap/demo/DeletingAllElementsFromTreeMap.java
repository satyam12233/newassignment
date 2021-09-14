package treemap.demo;

import java.util.TreeMap;

public class DeletingAllElementsFromTreeMap {
	public static void main(String[] args) {
		TreeMap<Integer,  String> map = new TreeMap<Integer , String>();
		map.put(101, " Satyam");
		map.put(103, " Naveen");
		map.put(102, " Sachin");
		map.put(105, " Vivek");
		map.put(104, " Harshit");
		
		System.out.println("The map is : " +map);
		
		// deleting all elements from tree map
		
		map.clear();
		System.out.println("The deleted Tree Map is" +map);
		
	}

}
