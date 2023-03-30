package linkedList;

public class DoubleLinkedDE<T> {
	T element;
	DoubleLinkedDE<T> next = null;
	DoubleLinkedDE<T> previous = null;
	
	public DoubleLinkedDE(T element, DoubleLinkedDE<T> next, DoubleLinkedDE<T> previous) {
		this.element = element;
		this.next = next;
		this.previous = previous;
	}
}
