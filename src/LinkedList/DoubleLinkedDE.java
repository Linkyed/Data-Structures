package LinkedList;

public class DoubleLinkedDE {
	double value = 0;
	DoubleLinkedDE next = null;
	DoubleLinkedDE previous = null;
	
	public DoubleLinkedDE(double value, DoubleLinkedDE next, DoubleLinkedDE previous) {
		this.value = value;
		this.next = next;
		this.previous = previous;
	}
}
