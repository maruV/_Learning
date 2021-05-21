/**
Code adapted from Data Structures and Problem Solving Using Java
by Mark Allen Weiss published by Addison Wesley
*/
import queuepackage.*;
import stackpackage.*;

public class BinaryTree {
	private BinaryTreeNode root;
	
	public BinaryTree(BinaryTreeNode root) {
		this.root = root;
	}
	
	public BinaryTree() {
		root = null;
	}
	
	private void preOrder(BinaryTreeNode node) {
		if (node != null) {
			System.out.println(node.getCargo());
			preOrder(node.getLeftChild());
			preOrder(node.getRightChild());
		}	
	}
	
	public void preOrder() {
		preOrder(root);
	}
	
	public void inOrder() {
		inOrder(root);
	}
	
	private void inOrder(BinaryTreeNode node) {
		if (node != null) {
			inOrder(node.getLeftChild());
			System.out.println(node.getCargo());
			inOrder(node.getRightChild());
		}	
	}
	
	public void postOrder() {
		postOrder(root);
	}
	
	private void postOrder(BinaryTreeNode node) {
		if (node != null) {
			postOrder(node.getLeftChild());
			postOrder(node.getRightChild());
			System.out.println(node.getCargo());
		}	
	}
	
	public void breadthFirst() {
		breadthFirst(root);
	}	
	
	private void breadthFirst(BinaryTreeNode node) {
		Queue queue = new Queue();
		queue.enqueue(node);
		while (!queue.isEmpty()) {
			BinaryTreeNode myNode = (BinaryTreeNode) queue.dequeue();
			System.out.println(myNode.getCargo());
			if  (myNode.getLeftChild() != null) {
				queue.enqueue(myNode.getLeftChild());
			}
			if (myNode.getRightChild() != null) {
				queue.enqueue(myNode.getRightChild());
			}
		}
	}	
	
	public void mystery() {
		mystery(root);
	}	
	
	private void mystery(BinaryTreeNode node) {
		Stack stack = new Stack();
		stack.push(node);
		while (!stack.isEmpty()) {
			BinaryTreeNode myNode = (BinaryTreeNode) stack.pop();
			System.out.println(myNode.getCargo());
			if  (myNode.getLeftChild() != null) {
				stack.push(myNode.getLeftChild());
			}
			if (myNode.getRightChild() != null) {
				stack.push(myNode.getRightChild());
			}
		}
	}	
	
	public BinaryTreeNode getRoot() {
		return root;
	}
	
	public void preOrderWithHeight() {
		preOrderWithHeight(root);
	}
	
	private void preOrderWithHeight(BinaryTreeNode node) {
		if (node != null) {
			System.out.println(node.getCargo());
			BinaryTree bt = new BinaryTree(node);
			System.out.println(bt.height());
			preOrderWithHeight(node.getLeftChild());
			preOrderWithHeight(node.getRightChild());
		}
	}
	
	public int height(BinaryTreeNode t) {
		if (t == null) {
			return -1;
		} else {
			return 1 + Math.max(height(t.getLeftChild()), height(t.getRightChild()));
		}
	}
	
	public int height() {
		if (root == null) {
			return -1;
		} else {
			return 1 + Math.max(height(root.getLeftChild()), height(root.getRightChild()));
		}
	}
	
	public void insertBT(Integer integer) {
		root = insertBT(root, integer);
	}
	
	private BinaryTreeNode insertBT(BinaryTreeNode node, Integer integer) {
		if (node == null) {
			return new BinaryTreeNode(integer);
		} 
		else if (integer.compareTo((Integer) node.getCargo()) == 0) {
			throw new DuplicateItemException();
		} else if (integer.compareTo((Integer) node.getCargo()) < 0) {
			node.setLeftChild(insertBT(node.getLeftChild(), integer));
			return node;
		} else {
			node.setRightChild(insertBT(node.getRightChild(), integer));
			return node;
		}	
	}
	
	public Integer find(Integer integer) {
		return find(root, integer);
	}
	
	private Integer find(BinaryTreeNode root, Integer integer) {
		if (root == null) {
			throw new ItemNotFoundException();
		}
		if (integer.compareTo((Integer) root.getCargo()) == 0) {
			return (Integer) root.getCargo();
		} else if (integer.compareTo((Integer) root.getCargo()) < 0) {
			return find(root.getLeftChild(), integer);
		} else {
			return find(root.getRightChild(), integer);
		}	
	}
	
	public Integer findMin() {
		return findMin(root);
	}
	
	private Integer findMin(BinaryTreeNode node) {
		if (node == null) {
			return (Integer) node.getCargo();
		}
		BinaryTreeNode temp = node;
		while (temp.getLeftChild() != null) {
			temp = temp.getLeftChild();
		}
		return (Integer) temp.getCargo();
	}	
}