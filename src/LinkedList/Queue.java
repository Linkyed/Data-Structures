package LinkedList;

import Errors.EmptyListException;

public class Queue extends List{
	
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
				System.out.println("The data element " + value + " is the " + position + "º in the queue");				
			} else {
				System.out.println("There is no data element with the value " + value + " in this queue");		
			}

		}
		else {
			throw new EmptyListException();
		}
	}
	
}
