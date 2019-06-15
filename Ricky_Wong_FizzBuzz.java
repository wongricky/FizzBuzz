package fizzBuzz;
import java.util.Scanner;


public class FizzBuzz {
	
	private int value;
	
	// Constructor, prompt for number input
	public FizzBuzz() {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		this.value = in.nextInt();
		in.close();
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
