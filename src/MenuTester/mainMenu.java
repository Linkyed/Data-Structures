package MenuTester;

import Errors.DataElementDoesntExistException;
import Errors.EmptyListException;
import Errors.IndexOutOfRangeException;
import LinkedList.List;
import LinkedList.Queue;
import LinkedList.Stack;

public class mainMenu {
	
	public static void main(String[] args) {
		int option = -1;
		List list = new List();
		Queue queue = new Queue();
		Stack stack = new Stack();
		while (option != 4) {
			System.out.println("[1] Start a List\n[2] Start a Queue\n[3] Start a Stack\n[4] Exit");
			option = menuMethods.chooseOption("Select one of the action above: ", 1, 4);
			while (option == 1) {
				int listOption = -1;
				System.out.println("\n===============Double Linked List===============");
				System.out.println("[1] Add a value\n"
						+ "[2] Remove a value\n"
						+ "[3] Search for a value\n"
						+ "[4] Get a value\n"
						+ "[5] Print all list\n"
						+ "[6] Exit list");
				listOption = menuMethods.chooseOption("Select one of the action above: ", 1, 6);
				if (listOption == 1) {
					double value = menuMethods.chooseValue("Type a value to add in the list: ");
					list.add(value);
				} else if (listOption == 2) {
					int index = menuMethods.chooseOption("Type the index of a value to remove it of the list: ", 0, list.getSize()-1);
					try {
						if (list.remove(index) == true) {
							System.out.println("Value of the index " + index + " was removed");
						}
					} catch (IndexOutOfRangeException | DataElementDoesntExistException | EmptyListException e) {
						e.printStackTrace();
					}
				} else if (listOption == 3) {
					double searchedValue = menuMethods.chooseValue("Type a value to try to find it in the list: ");
					try {
						list.find(searchedValue);
					} catch (EmptyListException e) {
						e.printStackTrace();
					}
				} else if (listOption == 4) {
					int index = menuMethods.chooseOption("Type the index of a value to remove it of the list: ", 0, list.getSize()-1);
					try {
						System.out.println("The value of index " + index + " in this list is: " + list.get(index));
					} catch (EmptyListException | IndexOutOfRangeException e) {
						e.printStackTrace();
					}
				} else if (listOption == 5) {
					list.printList();
				} else if (listOption == 6) {
					option = 0;
				}
			}
			while (option == 2) {
				int queueOption = -1;
				System.out.println("\n===============Queue===============");
				System.out.println("[1] Add a value\n"
						+ "[2] Remove a value\n"
						+ "[3] Search for a value\n"
						+ "[4] Get a value\n"
						+ "[5] Print all queue\n"
						+ "[6] Exit queue");
				queueOption = menuMethods.chooseOption("Select one of the action above: ", 1, 6);
				if (queueOption == 1) {
					double value = menuMethods.chooseValue("Type a value to add in the queue: ");
					queue.add(value);
				} else if (queueOption == 2) {
					if (queue.remove() == true) {
						System.out.println("The first value of the queue was removed");
					} else {
						System.out.println("The queue is empty, try again with elements on it!");
					}
				} else if (queueOption == 3) {
					double searchedValue = menuMethods.chooseValue("Type a value to try to find it in the queue: ");
					try {
						queue.find(searchedValue);
					} catch (EmptyListException e) {
						e.printStackTrace();
					}
				} else if (queueOption == 4) {
					try {
						System.out.println("The first value of the queue is: " + queue.get());
					} catch (EmptyListException e) {
						e.printStackTrace();
					}
				} else if (queueOption == 5) {
					queue.printQueue();
				} else if (queueOption == 6) {
					option = 0;
				}
			}
			while (option == 3) {
				int stackOption = -1;
				System.out.println("\n===============Stack===============");
				System.out.println("[1] Add a value\n"
						+ "[2] Remove a value\n"
						+ "[3] Search for a value\n"
						+ "[4] Get a value\n"
						+ "[5] Print all stack\n"
						+ "[6] Exit stack");
				stackOption = menuMethods.chooseOption("Select one of the action above: ", 1, 6);
				if (stackOption == 1) {
					double value = menuMethods.chooseValue("Type a value to add in the stack: ");
					stack.add(value);
				} else if (stackOption == 2) {
					if (stack.remove() == true) {
						System.out.println("The first value of the stack was removed");
					} else {
						System.out.println("The stack is empty, try again with elements on it!");
					}
				} else if (stackOption == 3) {
					double searchedValue = menuMethods.chooseValue("Type a value to try to find it in the stack: ");
					try {
						stack.find(searchedValue);
					} catch (EmptyListException e) {
						e.printStackTrace();
					}
				} else if (stackOption == 4) {
					try {
						System.out.println("The first value of the stack is: " + stack.get());
					} catch (EmptyListException e) {
						e.printStackTrace();
					}
				} else if (stackOption == 5) {
					stack.printStack();
				} else if (stackOption == 6) {
					option = 0;
				}
			}
		}
	}
	
}
