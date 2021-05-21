import java.util.*;
import java.io.*;
import TreePackage.*;

public class Prog6 {

	public static BinaryTree bt;			//creates a binary tree called bt
	public static Stack stack = new Stack();	//creates a stack called stack
	public static BinaryTreeNode btn;		//creates a binary tree node called btn

	public static void main(String[] args) {

		Scanner scanner = null;
		Scanner sc = new Scanner(System.in);
		String fileName = "";
		String line = "";
		
		boolean foundFile = false;
		int count = 0;
		//loops until a correct filename is found quits program after 3 attempts
		while (!foundFile) {
			System.out.print("Enter the filename you want to evaluate: ");
			try {
				fileName = sc.next();
				scanner = new Scanner(new File(fileName));
				foundFile = true;
			} catch (FileNotFoundException e) {
				count++;
				if (count == 3)
					System.exit(0);
				System.out.println("");
				System.out.println("File does not exist...");
			}		
		}
		
		try {
			line = scanner.nextLine();	//reads the line from the file
		} catch (NoSuchElementException e) {
			System.out.println("The file contains no data.");
			System.exit(0);
		}
		
		try {
			createTree(line);	//creates the tree using the line from the file
		} catch (EmptyStackException e) {
			System.out.println("The file contains an invalid expression.");
			System.exit(0);
		}
			
		System.out.println("");
		System.out.print("The fully parenthesized infix expression is: " + infixExpression(line));
		System.out.println("");
		System.out.println("");
		System.out.print("The answer after evaluating expression is: " + evalExpression(line));
		System.out.println("");
		System.out.println("");
		System.out.print("Level order traversal of tree using iterator is:" + printLevelOrder());
		System.out.println("");
		System.out.println("");
		System.out.print("Inorder traversal of the tree using iterator is:" + printInOrder());
		System.out.println("");
		System.out.println("");
		System.out.print("Preorder traversal of the tree using iterator is:" + printPreOrder());
	}
	
	//method creates the tree
	public static void createTree(String line) {
		for (int i = 0; i < line.length(); i++) {
			//the last character from the file
			if (i == line.length() - 1) {
				btn = new BinaryTreeNode(line.charAt(i));
				BinaryTreeNode btnright = (BinaryTreeNode) stack.pop();
				BinaryTreeNode btnleft = (BinaryTreeNode) stack.pop();
				try{
					bt = new BinaryTree(btnleft, btn, btnright);
				} catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
			//the current character is a digit
			else if (Character.isDigit(line.charAt(i))) {
				btn = new BinaryTreeNode(null, line.charAt(i), null);
				stack.push(btn);
			}
			//the current character is an operator
			else {
				BinaryTreeNode btnright = (BinaryTreeNode) stack.pop();
				BinaryTreeNode btnleft = (BinaryTreeNode) stack.pop();
				btn = new BinaryTreeNode(btnleft, line.charAt(i), btnright);
				stack.push(btn);
			}
		}
	}
	
	//method converts a postfix expression to an infix expression
	public static String infixExpression(String line) {
		String infix = "";
		for (int i = 0; i < line.length(); i++) {
			if (Character.isDigit(line.charAt(i)))
				stack.push(line.charAt(i));
			else {
				String rightnum = stack.pop().toString();
				String leftnum = stack.pop().toString();
				infix = "(" + leftnum + String.valueOf(line.charAt(i)) + rightnum + ")";
				stack.push(infix);
			}
		}
		return infix;
	}
	
	//method evaluates the postfix expression from the file
	public static Object evalExpression(String line) {
		for (int i = 0; i < line.length(); i++) {
			if (Character.isDigit(line.charAt(i)))
				stack.push(line.charAt(i));
			else {
				String rightnum = stack.pop().toString();
				String leftnum = stack.pop().toString();
				switch (line.charAt(i)) {
					case '-':
						stack.push(Integer.parseInt(leftnum) - Integer.parseInt(rightnum));
						break;
					case '+':
						stack.push(Integer.parseInt(leftnum) + Integer.parseInt(rightnum));
						break;
					case '*':
						stack.push(Integer.parseInt(leftnum) * Integer.parseInt(rightnum));
						break;
					case '/':
						stack.push(Integer.parseInt(leftnum) / Integer.parseInt(rightnum));
						break;
				}
			}
		}
		return stack.pop();
	}
	
	//method iterates through the tree using inorder traversal
	public static String printInOrder() {
		InOrderIterator iterator = new InOrderIterator(bt);
		String order = "";
		while (iterator.hasNext()) {
			btn = iterator.next();
			order = order + " " + btn.getCargo();
		}
		return order;
	}
	
	//method iterates through the tree using preorder traversal
	public static String printPreOrder() {
		PreOrderIterator iterator = new PreOrderIterator(bt);
		String order = "";
		while (iterator.hasNext()) {
			btn = iterator.next();
			order = order + " " + btn.getCargo();
		}
		return order;
	}
	
	//method iterates through the tree using postorder traversal
	public static String printPostOrder() {
		PostOrderIterator iterator = new PostOrderIterator(bt);
		String order = "";
		while (iterator.hasNext()) {
			btn = iterator.next();
			order = order + " " + btn.getCargo();
		}
		return order;
	}
	
	//method iterates through the tree using levelorder traversal
	public static String printLevelOrder() {
		LevelOrderIterator iterator = new LevelOrderIterator(bt);
		String order = "";
		while (iterator.hasNext()) {
			btn = iterator.next();
			order = order + " " + btn.getCargo();
		}
		return order;
	}
	
}