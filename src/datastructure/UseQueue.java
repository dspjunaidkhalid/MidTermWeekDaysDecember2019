package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> waitingQueue = new LinkedList<>();


		waitingQueue.add("Sir");
		waitingQueue.add("Fahim");
		waitingQueue.add("Seema");
		waitingQueue.add("Bursha");

		System.out.println("WaitingQueue : " + waitingQueue);

		String name = waitingQueue.remove();
		System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + waitingQueue);

		name = waitingQueue.poll();
		System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + waitingQueue);


	}

}
