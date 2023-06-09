package linkedList;

import java.util.Collections;

import exceptions.EmptyDataStructureException;
import exceptions.IndexOutOfRangeException;
import trees.BinaryTree;
import trees.TreeNode;

public class Test {
	
	public static void main(String[] args) throws EmptyDataStructureException, IndexOutOfRangeException {

		//====================Creating a double linked-list====================
		System.out.println("=================Double Linked List=================");
		List<Integer> list = new List<>();

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
		System.out.println("=================Queue=================");
		Queue<Integer> queue = new Queue();
		
		//Adding data elements in the queue
		for (int i = 1; i <= 10; i++) {
			queue.add(i);
		}
		
		//Printing the queue
		queue.printQueue();
		
		// Trying to get the first value of the queue
		System.out.println("First value: " + queue.get());

		//Trying to remove a element from the queue
		System.out.println("First value removed: " + queue.remove());	
		
		//Printing the queue
		queue.printQueue();

		//Trying to find a element with a given value and it position on the queue
		queue.find(7);

		//====================Creating a Stack====================
		System.out.println("=================Stack=================");
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 1; i <= 10; i++) {
			stack.add(i);
		}
		
		//Printing the stack
		stack.printStack();
		
		// Trying to get the first value of the stack
		System.out.println("First value: " + stack.get());
		
		//Trying to remove a element from the stack
		System.out.println("First value removed: " + stack.remove());	
		
		//Printing the stack
		stack.printStack();
		
		//Trying to find a element with a given value and it position on the stack
		stack.find(7);
		
		//====================Creating a Binary Tree====================
		BinaryTree<Integer> binaryTree = new BinaryTree<>();
		
		//Just some tests
		binaryTree.add(1);
		binaryTree.add(2);
		binaryTree.add(3);
		binaryTree.add(10);
		binaryTree.add(8);
		binaryTree.add(-1);
		
		//Printing the Tree
		binaryTree.showBinaryTree();
	
	}
}
