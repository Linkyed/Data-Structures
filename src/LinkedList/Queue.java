package LinkedList;

import Errors.EmptyListException;
import Utility.UsefulFunctions;

public class Queue extends UsefulFunctions{
	DataElement firstElement = null;
	DataElement lastElement = null;
	double size = 0;
	
	
	public void add(double value) {
		if (isEmpty()) {
			DataElement temporary =  new DataElement(value, null);
			firstElement = temporary;
			lastElement = temporary;			
		} else {
			DataElement temporary = new DataElement(value, null);
			lastElement.next = temporary;
			lastElement = temporary;
		}
		size++;
	}
	
	public boolean remove() {
		if (isEmpty()) {
			return false;
		} else {
			if (isNull.test(firstElement.next)) {
				firstElement = null;
			} else {
				DataElement aux = firstElement;
				firstElement = firstElement.next;
				aux.next = null;
				size--;
			}
			return true;
		}
	}
	
	
	public double get() throws EmptyListException {
		if (!isEmpty()) {
			return firstElement.value;
		} else {
			throw new EmptyListException();
		}
	}
	
	public void find(double value) throws EmptyListException {
		if (!isEmpty()) {
			DataElement aux = firstElement;
			int position = 1;
			while (isNotNull.test(aux.next) && aux.value != value) {
				aux = aux.next;
				position++;
			}
			if (aux.value == value) {
				println.accept("The data element " + value + " is the " + position + "º in the queue");				
			} else {
				println.accept("There is no data element with the value " + value + " in this queue");		
			}

		}
		else {
			throw new EmptyListException();
		}
	}
	
	public void printQueue() {
		if (!isEmpty()) {
			DataElement aux = firstElement;
			while(isNotNull.test(aux.next)) {
				print.accept(aux.value + "->");
				aux = aux.next;
			}
			println.accept(aux.value);			
		} else {
			println.accept("\nThis queue is empty!\n");
		}
	}
	
	public boolean isEmpty() {
		if (isNull.test(firstElement)) {
			return true;
		}
		return false;
	}
	
}
