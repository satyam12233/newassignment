package hashmap.demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class CopyingAMapToAnother {
	public static void main(String[] args) {
		
		Map<Integer , String> map = new LinkedHashMap<Integer , String>();
		map.put(1, "Red");
		map.put(2, "Green");
		map.put(3, "Black");
		map.put(4, "White");
		map.put(5, "Blue");
		
		System.out.println("The Map is : " +map);
		
		// creating another map
		Map<Integer , String> map1 = new LinkedHashMap<Integer , String>();
		map1 = (Map<Integer, String>) ((LinkedHashMap)map).clone();
		System.out.println("The cloned map is : " +map1);
		
	}

}
