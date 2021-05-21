import java.util.LinkedList;
import java.util.ListIterator;
import queuepackage.*;
//A truth tree class
public class TruthTree 
	{
	//the root
	private TruthTreeNode root;
	//simple constructor.  This is all we need
	public TruthTree(TruthTreeNode root) 
	{
		this.root = root;
	}
	//getter for the root
	public TruthTreeNode getRoot() 
	{
		return root;
	}
	//setter for the root.  Don't really need this
	public void setRoot(TruthTreeNode root) 
	{
		this.root = root;
	}
	//this method traverses the tree and returns the first unchecked node
	//that it finds.  Implement it with a breadth-first traversal.  Use a queue.
	//Implement it!!
	public TruthTreeNode findUnchecked(TruthTreeNode root) 
	{
		Queue queue = new Queue();
		queue.enqueue(root);
		while (!queue.isEmpty()) 
		{
			root = (TruthTreeNode) queue.dequeue();
			if (root.getChecked() == true)
			{
				return root;
			}
			else if  (root.getLeftChild() != null) 
			{
				queue.enqueue(root.getLeftChild());
			}
			else if (root.getRightChild() != null) 
			{
				queue.enqueue(root.getRightChild());
			}
		}
		return root;
	}
	
	//this method returns a LinkedList containing all the leaf nodes under a given
	//node (root).  Implement it using an inOrder traversal!!
	public LinkedList findLeaves(TruthTreeNode root, LinkedList list) 
	{
		if (root != null)
		{
			findLeaves(root.getLeftChild(), list);
			list.add(root);
			findLeaves(root.getRightChild(), list);
		}
		
		return list;
	}
	
   //this method provides a preOrder traversal of the tree
   public void printPreOrder(TruthTreeNode root) 
	{
		if (root != null) 
		{
			System.out.println(root.getPcSentence());
			printPreOrder(root.getLeftChild());
			printPreOrder(root.getRightChild());
		}
	}
}