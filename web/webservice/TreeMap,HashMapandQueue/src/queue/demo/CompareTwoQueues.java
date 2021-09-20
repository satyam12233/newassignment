//7. Write a Java program to compare two priority queues. 
package queue.demo;

import java.util.PriorityQueue;

public class CompareTwoQueues {
	public static void main(String[] args) {
		
		// creating priority queue 1
		PriorityQueue<String> queue1 = new PriorityQueue<String>();
		queue1.add("Satyam");
		queue1.add("Red");
		queue1.add("Black");
		queue1.add("Blue");
		
		System.out.println("Print the Queue 1 : " +queue1);
		
		//creating priority queue 2
		
		PriorityQueue<String> queue2 = new PriorityQueue<String>();
		queue2.add("Satyam");
		queue2.add("Violet");
		queue2.add("Black");
		queue2.add("Red");
		
		System.out.println("Print the Queue 2 : " +queue2);
		
		// comparing Queue1 and Queue2 
		
		
		for (String element : queue1){
            System.out.println(queue2.contains(element) ? "Yes" : "No");
	}
	
	
	
	
	}	
    
}

