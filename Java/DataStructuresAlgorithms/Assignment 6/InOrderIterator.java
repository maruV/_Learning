import TreePackage.*;
import QueuePackage.*;
import java.util.Iterator;

public class InOrderIterator implements Iterator
{
	Queue queue = new Queue();

	// Constructor calls the inOrder() method to create a queue of nodes
	public InOrderIterator(BinaryTree a)
	{
		queue = a.inOrder(queue);
	}
	
	// Return the next node on the queue
	public BinaryTreeNode next()
	{
		return (BinaryTreeNode)queue.dequeue();
	}
	
	// Return True if the queue is not empty
	public boolean hasNext()
	{
		return !this.queue.empty();
	}
	
	// Remove is not supported
	public void remove()
	{
		throw new UnsupportedOperationException("Remove is not supported");
	}
}