package fizzBuzz;
import java.util.Scanner;


public class FizzBuzz {
	
	private int value;
	
	public FizzBuzz() {
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
		
	// Function for modular return
	public String getString() {
		if (value%3 == 0 && value%5 == 0) {
			return ("FizzBuzz");
		}
		else if (value%3 == 0) {
			return ("Fizz");
		}
		else if (value%5 == 0) {
			return ("Buzz");
		}
		else {
			return (Integer.toString(value));
		}
	}
	

}

