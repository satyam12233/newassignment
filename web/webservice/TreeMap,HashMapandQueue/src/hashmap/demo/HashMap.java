//1. Write a Java program to associate the specified value with the specified key in a HashMap. 

package hashmap.demo;


import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap {
	public static void main(String[] args) {
		
		Map<Integer , String> map = new LinkedHashMap<Integer , String>();
		
		map.put(1 , " Satyam");
		map.put(2 , " Vivek");
		map.put(4 , " Naveen");
		map.put(3 , " Sachin");
		
		Iterator<Integer> itr = map.keySet().iterator();
		while(itr.hasNext()) {
		Integer	keydemo = itr.next();
		String valuedemo = map.get(keydemo);
		
		System.out.println("key "+keydemo+" values"+valuedemo);
			
		}
	

	
	}

}

