package Errors;

public class IndexOutOfRangeException extends RuntimeException{
	int chosenValue = 0;

	public IndexOutOfRangeException (int chosenValue) {
		this.chosenValue = chosenValue;
	}
	
	public String getMessage(){
		return String.format("The index '%s' is out of range", chosenValue);
	}
}
