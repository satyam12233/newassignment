//4. Write a Java program to insert a given element into a priority queue. 

package queue.demo;

import java.util.PriorityQueue;

public class InsertElementsInAQueue {
	public static void main(String[] args) {
		
		PriorityQueue<String> queue1 = new PriorityQueue<String>();
		
		queue1.add("Blue");
		queue1.add("Black");
		queue1.add("Red");
		
		System.out.println("Print the elements in a queue 1 : " +queue1);
		
		//adding a element in the queue 1
		
		queue1.offer("Violet");
		System.out.println("Print the new Queue : " +queue1);
		
	}

}
