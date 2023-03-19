package LinkedList;

public class DataElement {
	double value = 0;
	DataElement next = null;
	DataElement previous = null;
	
	public DataElement(double value, DataElement next, DataElement previous) {
		this.value = value;
		this.next = next;
		this.previous = previous;
	}
}
