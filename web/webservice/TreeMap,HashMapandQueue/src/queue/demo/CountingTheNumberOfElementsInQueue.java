//6. Write a Java program to count the number of elements in a priority queue. 

package queue.demo;

import java.util.PriorityQueue;

public class CountingTheNumberOfElementsInQueue {
	public static void main(String[] args) {
		
		PriorityQueue<String> queue1 = new PriorityQueue<String>();
		queue1.add("Hoensty");
		queue1.add("HardWork");
		queue1.add("Humanity");
		queue1.add("Humane");
		
		System.out.println("Print the elements of the queue : " +queue1);
		
		// counting the elements of the queue
		
		
		System.out.println("Print the size of the Queue : " +queue1.size());
		
	}

}
