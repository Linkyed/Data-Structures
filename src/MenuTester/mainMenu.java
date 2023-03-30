package MenuTester;

import Errors.EmptyDataStructureException;
import Errors.IndexOutOfRangeException;
import LinkedList.List;
import LinkedList.Queue;
import LinkedList.Stack;
import Utility.UsefulFunctions;

public class mainMenu extends UsefulFunctions {

	public static void main(String[] args) {

		int option = -1;
		List<Double> list = new List<>();
		Queue<Double> queue = new Queue<>();
		Stack<Double> stack = new Stack<>();

		while (option != 4) {
			println.accept("[1] Start a List\n[2] Start a Queue\n[3] Start a Stack\n[4] Exit");
			option = menuMethods.chooseOptionInRange("Select one of the action above: ", 1, 4);
			while (option == 1) {
				int listOption = -1;
				println.accept("\n===============Double Linked List===============");
				println.accept("[1] Add a value\n"
						+ "[2] Remove a value\n"
						+ "[3] Search for a value\n"
						+ "[4] Get a value\n"
						+ "[5] Print all list\n"
						+ "[6] Exit list");
				listOption = menuMethods.chooseOptionInRange("Select one of the action above: ", 1, 6);

				if (listOption == 1) {
					double value = menuMethods.chooseValue("Type a value to add in the list: ");
					list.add(value);
				} else if (listOption == 2) {
					int index = 0;
					try {
						index = menuMethods.chooseOption("Type the index of a value to remove it of the list: ");
						list.remove(index);
						println.accept("Value of the index " + index + " was removed");
					} catch (IndexOutOfRangeException e) {
						println.accept(e.getMessage());
						println.accept(
								String.format("Try a index that is in the range '%s' and '%s'", 0, list.getSize()));
					} catch (EmptyDataStructureException e) {
						println.accept(e.getMessage());
						println.accept("Try to add elements on the List");
					} 
				} else if (listOption == 3) {
					double searchedValue = menuMethods.chooseValue("Type a value to try to find it in the list: ");
					try {
						list.find(searchedValue);
					} catch (EmptyDataStructureException e) {
						println.accept(e.getMessage());
						println.accept("Try to add elements on the List");
					}
				} else if (listOption == 4) {
					int index = menuMethods.chooseOption("Type the index of a value to get it: ");
					try {
						println.accept("The value of index " + index + " in this list is: " + list.get(index));
					} catch (IndexOutOfRangeException e) {
						println.accept(e.getMessage());
						println.accept(
								String.format("Try a index that is in the range '%s' and '%s'", 0, list.getSize()));
					} catch (EmptyDataStructureException e) {
						println.accept(e.getMessage());
						println.accept("Try to add elements on the List");
					}
				} else if (listOption == 5) {
					list.printList();
				} else if (listOption == 6) {
					option = 0;
				}
			}
			while (option == 2) {
				int queueOption = -1;
				println.accept("\n===============Queue===============");
				println.accept("[1] Add a value\n"
						+ "[2] Remove a value\n"
						+ "[3] Search for a value\n"
						+ "[4] Get a value\n"
						+ "[5] Print all queue\n"
						+ "[6] Exit queue");
				queueOption = menuMethods.chooseOptionInRange("Select one of the action above: ", 1, 6);
				if (queueOption == 1) {
					double value = menuMethods.chooseValue("Type a value to add in the queue: ");
					queue.add(value);
				} else if (queueOption == 2) {
					try {
						queue.remove();
						println.accept("The first value of the queue was removed");
					} catch (EmptyDataStructureException e) {
						println.accept(e.getMessage());
						println.accept("Try to add elements on the Queue");
					}
				} else if (queueOption == 3) {
					double searchedValue = menuMethods.chooseValue("Type a value to try to find it in the queue: ");
					try {
						queue.find(searchedValue);
					} catch (EmptyDataStructureException e) {
						println.accept(e.getMessage());
						println.accept("Try to add elements on the Queue");
					}
				} else if (queueOption == 4) {
					try {
						println.accept("The first value of the queue is: " + queue.get());
					} catch (EmptyDataStructureException e) {
						println.accept(e.getMessage());
						println.accept("Try to add elements on the Queue");
					}
				} else if (queueOption == 5) {
					queue.printQueue();
				} else if (queueOption == 6) {
					option = 0;
				}
			}
			while (option == 3) {
				int stackOption = -1;
				println.accept("\n===============Stack===============");
				println.accept("[1] Add a value\n"
						+ "[2] Remove a value\n"
						+ "[3] Search for a value\n"
						+ "[4] Get a value\n"
						+ "[5] Print all stack\n"
						+ "[6] Exit stack");
				stackOption = menuMethods.chooseOptionInRange("Select one of the action above: ", 1, 6);
				if (stackOption == 1) {
					double value = menuMethods.chooseValue("Type a value to add in the stack: ");
					stack.add(value);
				} else if (stackOption == 2) {
					try {
						stack.remove();
						println.accept("The first value of the stack was removed");
					} catch (EmptyDataStructureException e) {
						println.accept(e.getMessage());
						println.accept("Try to add elements on the Stack");
					}
				} else if (stackOption == 3) {
					double searchedValue = menuMethods.chooseValue("Type a value to try to find it in the stack: ");
					try {
						stack.find(searchedValue);
					} catch (EmptyDataStructureException e) {
						println.accept(e.getMessage());
						println.accept("Try to add elements on the Stack");
					}
				} else if (stackOption == 4) {
					try {
						println.accept("The first value of the stack is: " + stack.get());
					} catch (EmptyDataStructureException e) {
						println.accept(e.getMessage());
						println.accept("Try to add elements on the Stack");
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
