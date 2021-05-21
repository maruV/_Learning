package stackpackage;
import java.util.LinkedList;

public class Stack {
	private LinkedList stack;
		
	public Stack() {
		stack = new LinkedList();
	}
	
	public boolean isEmpty() {
		return stack.size() == 0;
	}
	
	public Object pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return stack.removeFirst();
	}
	
	public void push(Object obj) {
		stack.addFirst(obj);
	}
	
	public Object peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return stack.peek();
	}
}