package LinkedList;

import Errors.DataElementDoesntExistException;
import Errors.EmptyListException;
import Errors.IndexOutOfRangeException;

public class main {
	
	public static void main(String[] args) throws EmptyListException, IndexOutOfRangeException, DataElementDoesntExistException {

		//====================Creating a double linked-list====================
		List list = new List();

		//Adding 10 data elements on it
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		
		//Printing the list
		list.printList();
		
		//Trying to remove a element by it index
		System.out.println("Removed element: " + list.remove(3));			
	
		//Printing the list
		list.printList();

		//Trying to find a element with a given value
		list.find(10);
		
		//Trying to get a value by it index and testing it on a operation
		System.out.println(list.get(7) - list.get(3));
		
		
		//====================Creating a Queue====================
		Queue queue = new Queue();
		
		//Adding data elements in the queue
		for (int i = 1; i <= 10; i++) {
			queue.add(i);
		}
		
		//Printing the queue
		queue.printList();
		
		// Trying to get the first value of the queue
		System.out.println("First value: " + queue.get());

		//Trying to remove a element from the queue
		System.out.println("First value removed: " + queue.remove());	
		
		//Printing the queue
		queue.printList();

		//Trying to find a element with a given value and it position on the queue
		queue.find(7);

	}
}
