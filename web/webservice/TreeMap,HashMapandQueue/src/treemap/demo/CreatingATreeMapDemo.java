//1. Write a Java program to associate the specified value with the specified key in a Tree Map. 

package treemap.demo;

import java.util.Iterator;
import java.util.TreeMap;

public class CreatingATreeMapDemo {
	
	public static void main(String[] args) {
		
		TreeMap<Integer,  String> map = new TreeMap<Integer , String>();
		
		map.put(101, " Satyam");
		map.put(103, " Naveen");
		map.put(102, " Sachin");
		
		Iterator<Integer> itr = map.keySet().iterator();
		
		while(itr.hasNext()) {
			Integer keydemo = itr.next();
			String valuedemo = map.get(keydemo);
			
			System.out.println("key " +keydemo+ " Values"+valuedemo);
			
		}
		
		
		
	}

}
