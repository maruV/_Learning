package queuepackage;
import java.util.LinkedList;

public class Queue {
	private LinkedList queue;
		
	public Queue() {
		queue = new LinkedList();
	}
	
	public boolean isEmpty() {
		return queue.size() == 0;
	}
	
	public Object dequeue() {
		if (queue.isEmpty()) {
			throw new EmptyQueueException();
		}
		return queue.removeLast();
	}
	
	public void enqueue(Object obj) {
		queue.addFirst(obj);
	}
}