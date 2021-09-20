//5. Write a Java program to remove all the elements from a priority queue. 

package queue.demo;

import java.util.PriorityQueue;

public class RemoveAllTheElementsInQueue {
	public static void main(String[] args) {
		
		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		queue.add("JavaPoint");
		queue.add("TutorialPoint");
		queue.add("JavaScript");
		
		System.out.println("Print the elements of queue : " +queue);
		
		//removing all the elements of the queue
		
		queue.removeAll(queue);
		System.out.println("Print the Queue : " +queue);
	}

}
