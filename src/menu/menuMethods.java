package menu;

import java.util.Scanner;

import utility.UsefulFunctions;

public class menuMethods extends UsefulFunctions{
	static Scanner userChoice = new Scanner(System.in);	
	
	static public int chooseOptionInRange(String message, int initialRange, int endRange) {
		int choice = -1;
		while (!isInRange(choice, initialRange, endRange)) {
			print.accept(message);
			try {
				choice = getUserInput.andThen(stringToInt).apply(userChoice);	
				if (!isInRange(choice, initialRange, endRange)) {
					println.accept("\nType a number that have a option linked to it please!\n");
				}
			} catch (Exception e) {
				println.accept("\nOnly type numbers please!\n");
			}			
		}
		return choice;
	}

	static public int chooseOption(String message) {
		int choice = -1;
		boolean validChoice = false;
		while (!validChoice) {
			print.accept(message);
			try {
				choice = getUserInput.andThen(stringToInt).apply(userChoice);	
				validChoice = true;
			} catch (Exception e) {
				println.accept("\nOnly type numbers please!\n");
			}			
		}
		return choice;
	}
	
	static public double chooseValue(String message) {
		double value = 0;
		boolean validValue = false;
		while (!validValue) {
			print.accept(message);
			try {
				value = getUserInput.andThen(stringToDouble).apply(userChoice);	
				validValue = true;
			} catch (Exception e) {
				println.accept("\nOnly type numbers please!\n");
			}			
		}
		return value;
	}
}
