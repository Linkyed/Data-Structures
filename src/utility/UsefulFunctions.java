package utility;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class UsefulFunctions {
	
	static public Consumer<Object> println = obj -> System.out.println(obj);
	
	static public Consumer<Object> print = obj -> System.out.print(obj);
	
	static public Function<Scanner, String> getUserInput = scan -> scan.nextLine();
	
	static public BiFunction<Integer, Integer, Boolean> inMaxRange = (n, nmax) -> n <= nmax ? true : false;
	
	static public BiFunction<Integer, Integer, Boolean> inMinRange = (n, nmin) -> n >= nmin ? true : false;
	
	static public Function<String, Double> stringToDouble = str -> Double.parseDouble(str);
	
	static public Function<String, Integer> stringToInt = str -> Integer.parseInt(str);
	
	static public Predicate<Object> isNull = obj -> obj == null ? true : false;
	
	static public Predicate<Object> isNotNull = obj -> obj != null ? true : false;
	
	static public boolean isInRange(double value, double start, double end) {
		if (start > end ){
			throw new IllegalArgumentException();
		}
		if (value >= start && value <= end) {
			return true;
		} 
		return false;
	}
	
	

	
}
