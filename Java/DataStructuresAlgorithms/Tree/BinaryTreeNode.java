/**
Code adapted from Data Structures and Problem Solving Using Java
by Mark Allen Weiss published by Addison Wesley
*/
public class BinaryTreeNode {
	
	private Object cargo;
	private BinaryTreeNode leftChild;
	private BinaryTreeNode rightChild;
	
	public BinaryTreeNode(Object cargo) {
		this(null, cargo, null);
	}
	
	public BinaryTreeNode(BinaryTreeNode leftChild, Object cargo, BinaryTreeNode rightChild) {
		this.leftChild = leftChild;
		this.cargo = cargo;
		this.rightChild = rightChild;
	}

	public Object getCargo() {
		return cargo;
	}
	
	public void setCargo(Object cargo) {
		this.cargo = cargo;
	}
	
	public BinaryTreeNode getLeftChild() {
		return leftChild;
	}
	
	public void setLeftChild(BinaryTreeNode leftChild) {
		this.leftChild = leftChild;
	}
	
	public BinaryTreeNode getRightChild() {
		return rightChild;
	}
	
	public void setRightChild(BinaryTreeNode rightChild) {
		this.rightChild = rightChild;
	}
}