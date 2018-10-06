package co.edureka.collections;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		// Adding 10 firstly and 1 lastly
		for(int i=10;i>0;i--){
			queue.add(i);
			System.out.println(i+" added in queue !!");
		}

		// As per FIFO, our queue is: 
		// Head | 10 9 8 7 6 5 4 3 2 1 | Tail
		
		// PrioirtyQueue Sorts the data for us
		// Hence, PQ shall have below structure:
		// Head | 1 2 3 4 5 6 7 8 9 10 | Tail
		
		// 1. Peeking : Retrieve Head of Queue
		/*int head = queue.peek();
		System.out.println("Head is: "+head); //1
		System.out.println("Size is: "+queue.size());
		
		//2. Polling : Removing the head of the Queue
		queue.poll();
		head = queue.peek();
		System.out.println("Head now is: "+head); // 2
		System.out.println("Size Now is: "+queue.size());*/
		
		System.out.println();
		for(int i=1;i<queue.size();i++){  // size will decrease when head is removed
			System.out.println(queue.peek()); // peek will give head
			queue.poll(); // remove head
		}
		
	}

}
