//2. Write a Java program to iterate through all elements in priority queue. S

package queue.demo;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueIterationOfElements {
	
	public static void main(String[] args) {
		
		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		queue.add("Satyam");
		queue.add("Abhinav");
		queue.add("Shubham");
		queue.add("Javapoint");
		
		Iterator<String> itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
