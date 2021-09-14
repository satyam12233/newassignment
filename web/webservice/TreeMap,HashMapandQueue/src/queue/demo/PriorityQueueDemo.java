

package queue.demo;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		
		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		queue.add("Satyam");
		queue.add("Javapoint");
		queue.add("TutorialPoint");
		queue.add("Geeks For Geek");
		
		System.out.println("head " +queue.element());
		System.out.println("head " +queue.peek());
		System.out.println("Iterating the queue elements");
		
		Iterator<String> itr = queue.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		
		}
		
		queue.remove();
		//queue.poll();
		System.out.println("After removing the elements in the queue");
		
		Iterator <String> itr2 = queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
	}


