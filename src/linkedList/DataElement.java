package linkedList;

public class DataElement<T> {
	T element;
	DataElement<T> next = null;
	
	public DataElement(T element, DataElement<T> next) {
		this.element = element;
		this.next = next;
	}
}
