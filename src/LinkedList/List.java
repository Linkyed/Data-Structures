package LinkedList;

import Errors.DataElementDoesntExistException;
import Errors.EmptyListException;
import Errors.IndexOutOfRangeException;
import Utility.UsefulFunctions;

public class List extends UsefulFunctions{
	DoubleLinkedDE firstElement = null;
	DoubleLinkedDE lastElement = null;
	int size = 0;
	
	public void add(double value) {
		if (isEmpty()) {
			DoubleLinkedDE temporary =  new DoubleLinkedDE(value, null, null);
			firstElement = temporary;
			lastElement = temporary;			
		} else {
			DoubleLinkedDE temporary = new DoubleLinkedDE(value, null, lastElement);
			lastElement.next = temporary;
			lastElement = temporary;
		}
		size++;
	}
	
	public boolean remove(int index) throws IndexOutOfRangeException, DataElementDoesntExistException, EmptyListException {
		if (!isEmpty()) {			
			DoubleLinkedDE aux = firstElement;
			if (isInRange(index, 0, size-1)) {
				for (int i = 0; i < index; i++) {
					aux = aux.next;
				}			
				if (aux == firstElement) {
					firstElement = aux.next;
					aux.next.previous = null;
					aux.next = null;
				} else if (aux == lastElement) {
					lastElement = aux.previous;
					aux.previous.next = null;
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
			DoubleLinkedDE aux = firstElement;
			int index = 0;
			while(isNotNull.test(aux.next) && aux.value != value) {
				aux = aux.next;
				index++;
			}			
			if (aux.value == value) {
				println.accept("The data element " + value + " is on the index " + index);				
			} else {
				println.accept("There is no element with value " + value + " in this list");
			}
		}
		else {
			throw new EmptyListException();
		}
	}
	
	public double get(int index) throws EmptyListException, IndexOutOfRangeException {
		if (!isEmpty()) {			
			DoubleLinkedDE aux = firstElement;
			if (isInRange(index, 0, size-1)) {
				for (int i = 0; i < index; i++) {
					aux = aux.next;
				}			
				return aux.value;
			}
		} else {
			throw new EmptyListException();
		}
		throw new IndexOutOfRangeException();
	}
	
	public void printList() {
		if (!isEmpty()) {
			DoubleLinkedDE aux = firstElement;
			while(isNotNull.test(aux.next)) {
				print.accept(aux.value + "->");
				aux = aux.next;
			}
			println.accept(aux.value);			
		} else {
			println.accept("\nThis list is empty!\n");
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		if (isNull.test(firstElement)) {
			return true;
		}
		return false;
	}
	
}
