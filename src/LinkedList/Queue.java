package LinkedList;

import Errors.EmptyDataStructureException;
import Utility.UsefulFunctions;

public class Queue<T> extends UsefulFunctions{
	DataElement<T> firstElement = null;
	DataElement<T> lastElement = null;
	double size = 0;
	
	
	public void add(T element) {
		if (isEmpty()) {
			DataElement<T> temporary =  new DataElement<>(element, null);
			firstElement = temporary;
			lastElement = temporary;			
		} else {
			DataElement<T> temporary = new DataElement<>(element, null);
			lastElement.next = temporary;
			lastElement = temporary;
		}
		size++;
	}
	
	public boolean remove() {
		if (isEmpty()) {
			throw new EmptyDataStructureException("Queue");
		} else {
			if (isNull.test(firstElement.next)) {
				firstElement = null;
			} else {
				DataElement<T> aux = firstElement;
				firstElement = firstElement.next;
				aux.next = null;
				size--;
			}
			return true;
		}
	}
	
	
	public T get() throws EmptyDataStructureException {
		if (!isEmpty()) {
			return firstElement.element;
		} else {
			throw new EmptyDataStructureException("Queue");
		}
	}
	
	public void find(T element) throws EmptyDataStructureException {
		if (!isEmpty()) {
			DataElement<T> aux = firstElement;
			int position = 1;
			while (isNotNull.test(aux.next) && !aux.element.equals(element)) {
				aux = aux.next;
				position++;
			}
			if (aux.element.equals(element)) {
				println.accept("The data element '" + element + "' is the " + position + "º in the queue");				
			} else {
				println.accept("There is no data element with the value '" + element + "' in this queue");		
			}

		}
		else {
			throw new EmptyDataStructureException("Queue");
		}
	}
	
	public void printQueue() {
		if (!isEmpty()) {
			DataElement<T> aux = firstElement;
			while(isNotNull.test(aux.next)) {
				print.accept(aux.element + "->");
				aux = aux.next;
			}
			println.accept(aux.element);			
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
