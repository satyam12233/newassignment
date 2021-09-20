//3. Write a Java program to add all the elements of a priority queue to another priority queue. 

package queue.demo;

import java.util.PriorityQueue;

public class AddingElementsInAQueue {
	public static void main(String[] args) {
		
		//creating priority queue 1
		PriorityQueue<String> queue1 = new PriorityQueue<String>();
		queue1.add("Red");
		queue1.add("Blue");
		queue1.add("Green");
	    queue1.add("Black");
	    
	    System.out.println("Print the priority queue 1 : " +queue1);
	    
	    // creating priority queue 2
	    PriorityQueue<String> queue2 = new PriorityQueue<String>();
	    queue2.add("Satyam");
		queue2.add("Naveen");
		queue2.add("Vivek");
	    queue2.add("Sahil");
	    
	    System.out.println("Print the priority queue 2 : " +queue2);
	    
	    //adding the elements of queue 1 in queue 2
	    
	    queue1.addAll(queue2);
	    System.out.println("Print the new Priority Queue: " +queue1);
	}
}
