package queuepackage;

public class EmptyQueueException extends RuntimeException {
	public EmptyQueueException() {
		super();
	}
	
	public EmptyQueueException(String msg) {
		super(msg);
	}
}