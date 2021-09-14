//7. Write a Java program to sort keys in Tree Map by using comparator. 
package treemap.demo;

import java.util.Comparator;
import java.util.TreeMap;

public class SortingByComparator {
	public static void main(String[] args) {
		
		TreeMap<Integer,  String> map = new TreeMap<Integer , String>();
		
		map.put(101, " Satyam");
		map.put(103, " Naveen");
		map.put(102, " Sachin");
		map.put(110, " Praveen");
		map.put(121, " Vivek");
		
		System.out.println("The map is : "+map);
	}
	
	class sort_key implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o1.compareTo(o2);
		}
		
	}
}
