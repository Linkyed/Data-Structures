package linkedList;

import exceptions.EmptyDataStructureException;
import exceptions.IndexOutOfRangeException;
import utility.UsefulFunctions;

public class List<T> extends UsefulFunctions{
	DoubleLinkedDE<T> firstElement = null;
	DoubleLinkedDE<T> lastElement = null;
	int size = 0;
	
	public void add(T element) {
		if (isEmpty()) {
			DoubleLinkedDE<T> temporary =  new DoubleLinkedDE<>(element, null, null);
			firstElement = temporary;
			lastElement = temporary;			
		} else {
			DoubleLinkedDE<T> temporary = new DoubleLinkedDE<>(element, null, lastElement);
			lastElement.next = temporary;
			lastElement = temporary;
		}
		size++;
	}
	
	public boolean remove(int index) throws IndexOutOfRangeException, EmptyDataStructureException {
		if (!isEmpty()) {			
			DoubleLinkedDE<T> aux = firstElement;
			if (isInRange(index, 0, size-1)) {
				for (int i = 0; i < index; i++) {
					aux = aux.next;
				}			
				if (aux == firstElement) {
					try {
						firstElement = aux.next;
						aux.next.previous = null;
						aux.next = null;
					} catch (NullPointerException e){
						firstElement = null;
					}
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
			throw new EmptyDataStructureException("List");
		}
		throw new IndexOutOfRangeException(index);
	}
	
	public void find(T element) throws EmptyDataStructureException {
		if (!isEmpty()) {
			DoubleLinkedDE<T> aux = firstElement;
			int index = 0;
			while(isNotNull.test(aux.next) && aux.element != element) {
				aux = aux.next;
				index++;
			}			
			if (aux.element == element) {
				println.accept("The data element " + element + " is on the index " + index);				
			} else {
				println.accept("There is no element with value " + element + " in this list");
			}
		}
		else {
			throw new EmptyDataStructureException("List");
		}
	}
	
	public T get(int index) throws EmptyDataStructureException, IndexOutOfRangeException {
		if (!isEmpty()) {			
			DoubleLinkedDE<T> aux = firstElement;
			if (isInRange(index, 0, size-1)) {
				for (int i = 0; i < index; i++) {
					aux = aux.next;
				}			
				return aux.element;
			}
		} else {
			throw new EmptyDataStructureException("List");
		}
		throw new IndexOutOfRangeException(index);
	}
	
	public void printList() {
		if (!isEmpty()) {
			DoubleLinkedDE<T> aux = firstElement;
			while(isNotNull.test(aux.next)) {
				print.accept(aux.element + "->");
				aux = aux.next;
			}
			println.accept(aux.element);			
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
