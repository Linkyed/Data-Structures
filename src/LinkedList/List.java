package LinkedList;

import Errors.DataElementDoesntExistException;
import Errors.EmptyListException;
import Errors.IndexOutOfRangeException;

public class List {
	DataElement firstElement = null;
	DataElement lastElement = null;
	double size = 0;
	
	public void add(double value) {
		if (isEmpty()) {
			DataElement temporary =  new DataElement(value, null, null);
			firstElement = temporary;
			lastElement = temporary;			
		} else {
			DataElement temporary = new DataElement(value, null, lastElement);
			lastElement.next = temporary;
			lastElement = temporary;
		}
		size++;
	}
	
	public boolean remove(int index) throws IndexOutOfRangeException, DataElementDoesntExistException, EmptyListException {
		if (!isEmpty()) {			
			DataElement aux = firstElement;
			if (index <= size && index >= 0) {
				for (int i = 0; i < index; i++) {
					aux = aux.next;
				}			
				if (aux == firstElement) {
					aux.next.previous = aux.previous;
					aux.next = null;
				} else if (aux == lastElement) {
					aux.previous.next = aux.next;
					aux.previous = null;
				} else {
					aux.next.previous = aux.previous;
					aux.previous.next = aux.next;
				}
				size--;
				return true;
			}
		} else {
			throw new EmptyListException();
		}
		throw new IndexOutOfRangeException("teste");
	}
	
	public void find(double value) throws EmptyListException {
		if (!isEmpty()) {
			DataElement aux = firstElement;
			int index = 0;
			while(aux.next != null && aux.value != value) {
				aux = aux.next;
				index++;
			}			
			if (aux.value == value) {
				System.out.println("The data element " + value + " is on the index " + index);				
			} else {
				System.out.println("There is no element with value " + value + " in this list");
			}
		}
		else {
			throw new EmptyListException();
		}
	}
	
	public double get(int index) throws EmptyListException, IndexOutOfRangeException {
		if (!isEmpty()) {			
			DataElement aux = firstElement;
			if (index <= size && index >= 0) {
				for (int i = 0; i < index; i++) {
					aux = aux.next;
				}			
				return aux.value;
			}
		} else {
			throw new EmptyListException();
		}
		throw new IndexOutOfRangeException("teste");
	}
	
	public void printList() {
		if (!isEmpty()) {
			DataElement aux = firstElement;
			while(aux.next != null) {
				System.out.println(aux.value);
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
