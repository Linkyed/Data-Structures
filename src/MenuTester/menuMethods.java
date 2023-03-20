package MenuTester;

import java.util.Scanner;

public class menuMethods {
	static Scanner userChoice = new Scanner(System.in);	
	
	static public int chooseOption(String message, int initialRange, int endRange) {
		int choice = -1;
		while (choice < initialRange || choice > endRange) {
			System.out.print(message);
			try {
				choice = Integer.parseInt(userChoice.nextLine());	
				if (choice < initialRange || choice > endRange) {
					System.out.println("\nType a number that have a option linked to it please!\n");
				}
			} catch (Exception e) {
				System.out.println("\nOnly type numbers please!\n");
			}			
		}
		return choice;
	}
	
	static public double chooseValue(String message) {
		double value = 0;
		boolean validValue = false;
		while (!validValue) {
			System.out.print(message);
			try {
				value = Double.parseDouble(userChoice.nextLine());	
				validValue = true;
			} catch (Exception e) {
				System.out.println("\nOnly type numbers please!\n");
			}			
		}
		return value;
	}
}
