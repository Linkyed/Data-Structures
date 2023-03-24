package LinkedList;

import Errors.EmptyDataStructureException;
import Utility.UsefulFunctions;

public class Stack extends UsefulFunctions{
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
			throw new EmptyDataStructureException("Stack");
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
	
	public double get() throws EmptyDataStructureException {
		if (!isEmpty()) {
			return firstElement.value;
		} else {
			throw new EmptyDataStructureException("Stack");
		}
	}
	
	public void find(double value) throws EmptyDataStructureException {
		if (!isEmpty()) {
			DataElement aux = firstElement;
			int position = 1;
			while (isNotNull.test(aux.next) && aux.value != value) {
				aux = aux.next;
				position++;
			}
			if (aux.value == value) {
				println.accept("The data element " + value + " is the " + position + "º in the stack");				
			} else {
				println.accept("There is no data element with the value " + value + " in this stack");		
			}

		}
		else {
			throw new EmptyDataStructureException("Stack");
		}
	}
	
	public void printStack() {
		if (!isEmpty()) {
			DataElement aux = firstElement;
			while(isNotNull.test(aux.next)) {
				print.accept(aux.value + "->");
				aux = aux.next;
			}
			println.accept(aux.value);			
		} else {
			println.accept("\nThis stack is empty!\n");
		}
	}
	
	public boolean isEmpty() {
		if (isNull.test(firstElement)) {
			return true;
		}
		return false;
	}
	
}
