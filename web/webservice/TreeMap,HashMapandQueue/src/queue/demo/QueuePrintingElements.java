//1. Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue. 

package queue.demo;

import java.util.PriorityQueue;

public class QueuePrintingElements {
	public static void main(String[] args) {
		
		PriorityQueue<String> queue1 = new PriorityQueue<String>();
		queue1.add("Red");
		queue1.add("Blue");
		queue1.add("Green");
		queue1.add("Black");
		
		System.out.println("The elements of the queue are : "+queue1);

}
}