package LinkedList;

import Errors.DataElementDoesntExistException;
import Errors.EmptyListException;
import Errors.IndexOutOfRangeException;

public class List {
	DataElement firstElement = null;
	DataElement lastElement = null;
	double size = 0;
	
	public void addElement(double value) {
		if (firstElement == null) {
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
	
	public double removeElement(DataElement element) throws EmptyListException {
		if (firstElement != null) {
			DataElement aux = element;
			if (element == firstElement) {
				aux.next.previous = aux.previous;
				aux.next = null;
			} else if (element == lastElement) {
				aux.previous.next = aux.next;
				aux.previous = null;
			} else {
				aux.next.previous = aux.previous;
				aux.previous.next = aux.next;
			}
			size--;
			return aux.value;
		} else {
			throw new EmptyListException();
		}
	}
	
	public double removeElement(int index) throws IndexOutOfRangeException, DataElementDoesntExistException, EmptyListException {
		if (firstElement != null) {			
			DataElement aux = firstElement;
			if (index <= size && index >= 0) {
				for (int i = 0; i < index; i++) {
					aux = aux.next;
				}			
				return removeElement(aux);
			}
		} else {
			throw new EmptyListException();
		}
		throw new IndexOutOfRangeException("teste");
	}
	
	public boolean findElement(double value) throws EmptyListException {
		if (firstElement != null) {
			DataElement aux = firstElement;
			if (value == aux.value) {
				return true;
			}
			while(aux.next != null) {
				if (aux.value == value) {
					return true;
				}
				aux = aux.next;
			}			
			return false;
		}
		else {
			throw new EmptyListException();
		}
	}
	
	public void showList() {
		if (firstElement != null) {
			DataElement aux = firstElement;
			while(aux.next != null) {
				System.out.println(aux.value);
				aux = aux.next;
			}
			System.out.println(aux.value);			
		}
	}
	
}
