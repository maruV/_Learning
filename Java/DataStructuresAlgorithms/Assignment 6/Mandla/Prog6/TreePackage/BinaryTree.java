package TreePackage;

import QueuePackage.*;
import java.io.*;

public class BinaryTree
{
  /**
   * The root pointer.
   */
  BinaryTreeNode root;

  /**
   *Constructor for the BinaryTree object
   */
  public BinaryTree()
  {
	  root = null;
  }

  public BinaryTree(BinaryTreeNode t1, BinaryTreeNode t,
      BinaryTreeNode t2)
  {
    root = t;
    t.setLeftChild(t1);
    t.setRightChild(t2);
  }

  public boolean isEmpty()
  {
    return this.root == null;
  }

  public void makeEmpty()
  {
    this.root = null;
  }

  /**
   * Gets the root attribute of the BinaryTree object
   *
   * @return The root value
   */
  public BinaryTreeNode getRoot()
  {
    return this.root;
  }

  public void insertLeft(BinaryTreeNode parent, Object value) throws java.lang.Exception
  {
    if (parent == null)
    {
      if (root != null)
      {
	throw new Exception("Trying to replace an existing tree");
      }
      root = new BinaryTreeNode(value);
    } else
    {
      if (parent.getLeftChild() != null)
      {
	throw new Exception("Trying to replace a left sub-tree");
      }
      parent.setLeftChild(new BinaryTreeNode(value));
    }
  }

  public void insertRight(BinaryTreeNode parent, Object value) throws java.lang.Exception
  {
    if (parent == null)
    {
      if (root != null)
      {
        throw new Exception("Trying to replace an existing tree");
      }
      root = new BinaryTreeNode(value);
    } else
    {
      if (parent.getRightChild() != null)
      {
	throw new Exception("Trying to replace a right sub-tree");
      }
      parent.setRightChild(new BinaryTreeNode(value));
    }
  }

  public Queue inOrder(Queue queue)
  {
    Queue q = inOrder(root, queue);
    return q;
  }

  private Queue inOrder(BinaryTreeNode root, Queue queue)
  {
     if (root != null)
     {
       inOrder(root.getLeftChild(), queue);
       queue.enqueue(root);
       inOrder(root.getRightChild(), queue);
     }
     return queue;
  }

  public Queue preOrder(Queue queue)
  {
     Queue q = preOrder(root, queue);
     return q;
  }

  private Queue preOrder(BinaryTreeNode root, Queue queue)
  {
     if (root != null) 
     {
       queue.enqueue(root);
       preOrder(root.getLeftChild(), queue);
       preOrder(root.getRightChild(), queue);
     }
     return queue;
  }

  public Queue postOrder(Queue queue)
  {
    Queue q = postOrder(root, queue);
    return q;
  }
  
  private Queue postOrder(BinaryTreeNode root, Queue queue) 
  {
    if (root != null)
    {
      postOrder(root.getLeftChild(), queue);
      postOrder(root.getRightChild(), queue);
      queue.enqueue(root);
    }
    return queue;
  }

  public Queue levelOrder(Queue queue)
  {
    Queue q = levelOrder(root, queue);
    return q;
  }

  private Queue levelOrder(BinaryTreeNode root, Queue queue)
  {
    Queue q = new Queue();
    if (root != null) 
      q.enqueue(root);

    while (!q.empty()) 
    {
      BinaryTreeNode node = (BinaryTreeNode) q.dequeue();
      queue.enqueue(node);
      BinaryTreeNode left = node.getLeftChild();
      BinaryTreeNode right = node.getRightChild();
      if (left != null)
	  q.enqueue(left);
      if (right != null)
	q.enqueue(right);
    }
    return queue;
  }
	
  public void inOrder()
  {
    inOrder(root);
  }

  private void inOrder(BinaryTreeNode root)
  {
    if (root != null)
    {
      inOrder(root.getLeftChild());
      System.out.print(root.getCargo() + " ");
      inOrder(root.getRightChild());
    }
  }

  public void preOrder()
  {
    preOrder(root);
  }

  private void preOrder(BinaryTreeNode root)
  {
    if (root != null)
    {
      System.out.print(root.getCargo() + " ");
      preOrder(root.getLeftChild());
      preOrder(root.getRightChild());
    }
  }

  public void postOrder()
  {
    postOrder(root);
  }

  private void postOrder(BinaryTreeNode root) 
  {
    if (root != null)
    {
      postOrder(root.getLeftChild());
      postOrder(root.getRightChild());
      System.out.print(root.getCargo() + " ");
    }
  }

  public void levelOrder() 
  {
    levelOrder(root);
  }

  private void levelOrder(BinaryTreeNode root) 
  {
    Queue queue = new Queue();
    if (root != null) 
      queue.enqueue(root);

    while (!queue.empty()) 
    {
      BinaryTreeNode node = (BinaryTreeNode) queue.dequeue();
      System.out.print(node.getCargo() + " ");
      BinaryTreeNode left = node.getLeftChild();
      BinaryTreeNode right = node.getRightChild();
      if (left != null)
	queue.enqueue(left);
      if (right != null)
	queue.enqueue(right);
    }
  }
}
