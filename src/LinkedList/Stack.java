package LinkedList;

import Errors.EmptyListException;

public class Stack {
	DataElement firstElement = null;
	DataElement lastElement = null;
	double size = 0;
	
	
	public void add(double value) {
		if (isEmpty()) {
			DataElement temporary =  new DataElement(value, null);
			firstElement = temporary;
			lastElement = temporary;			
		} else {
			DataElement temporary = new DataElement(value, firstElement);
			firstElement = temporary;
		}
		size++;
	}
	
	public boolean remove() {
		if (isEmpty()) {
			return false;
		} else {
			if (firstElement.next == null) {
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
			while (aux.next != null && aux.value != value) {
				aux = aux.next;
				position++;
			}
			if (aux.value == value) {
				System.out.println("The data element " + value + " is the " + position + "º in the stack");				
			} else {
				System.out.println("There is no data element with the value " + value + " in this stack");		
			}

		}
		else {
			throw new EmptyListException();
		}
	}
	
	public void printStack() {
		if (!isEmpty()) {
			DataElement aux = firstElement;
			while(aux.next != null) {
				System.out.print(aux.value + "->");
				aux = aux.next;
			}
			System.out.println(aux.value);			
		}
	}
	
	public boolean isEmpty() {
		if (firstElement == null) {
			return true;
		}
		return false;
	}
	
}
