
public class TreeBuilder {
	public static void main(String[] args) {
		/*
		BinaryTreeNode root = new BinaryTreeNode(new Integer(55));
		BinaryTree bt = new BinaryTree(root);
		
		BinaryTreeNode node1 = new BinaryTreeNode(new Integer(45));
		bt.getRoot().setLeftChild(node1);
		BinaryTreeNode node2 = new BinaryTreeNode(new Integer(65));
		bt.getRoot().setRightChild(node2);
		
		BinaryTreeNode node3 = new BinaryTreeNode(new Integer(37));
		bt.getRoot().getLeftChild().setLeftChild(node3);
		
		BinaryTreeNode node4 = new BinaryTreeNode(new Integer(18));
		bt.getRoot().getLeftChild().getLeftChild().setLeftChild(node4);
		
		BinaryTreeNode node5 = new BinaryTreeNode(new Integer(24));
		bt.getRoot().getLeftChild().getLeftChild().getLeftChild().setRightChild(node5);
		*/
		BinaryTree bt = new BinaryTree();
		bt.insertBT(new Integer(55));
		bt.insertBT(new Integer(45));
		bt.insertBT(new Integer(65));
		bt.insertBT(new Integer(60));
		bt.insertBT(new Integer(57));
		bt.insertBT(new Integer(63));
		bt.insertBT(new Integer(70));
		bt.insertBT(new Integer(68));
		bt.insertBT(new Integer(80));
		bt.insertBT(new Integer(37));
		
		bt.insertBT(new Integer(18));
		bt.insertBT(new Integer(10));
		bt.insertBT(new Integer(24));
		
		bt.preOrder();
		System.out.println();
		bt.mystery();
		System.out.println();
		System.out.println(bt.findMin());
		//System.out.println(bt.find(new Integer(45)));
		/*
		bt.mystery();
		System.out.println();
		bt.preOrder();
		System.out.println();
		
		bt.inOrder();
		System.out.println();
		bt.postOrder();
		System.out.println();	
		bt.breadthFirst();
		*/
	}
}