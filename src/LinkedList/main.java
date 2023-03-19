package LinkedList;

import java.util.Random;

import Errors.EmptyListException;

public class main {
	
	public static void main(String[] args) {
		Random random = new Random();
		List list = new List();

		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 100000000; i++) {
			//list.addElement(random.nextInt(100));
			list.addElement(i);
		}
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("It took " + duration/1000.0 + " seconds to add all the numbers on the list!");
		//list.showList();
		try {
			System.out.println("Removed element: " + list.removeElement(1));			
		} catch (Exception e) {
			System.out.println("The index is out of range");
		}
		//list.showList();
		try {
			startTime = System.currentTimeMillis();
			boolean finded = list.findElement(99999999);
			endTime = System.currentTimeMillis();
			duration = endTime - startTime;
			if (finded == true) {
				System.out.println("The value is on the list!");
				System.out.println("It tooked " + duration/1000.0 + " seconds to find the value");
			} else {
				System.out.println("The value is not on the list!");
				System.out.println("It took " + duration/1000.0 + " seconds to go through to all values of the list");
			}
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
