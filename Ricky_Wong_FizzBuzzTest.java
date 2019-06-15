package fizzBuzz;

import java.util.Scanner;

public class FizzBuzzTest {

	public static void main(String[] args) {
		
		// TODO: get number // if number %3 == 0 - Fizz // if number %5 == 0 - Buzz // if %3 && %5 == 0 - FizzBuzz // else return number
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int value = in.nextInt();
		FizzBuzz fb = new FizzBuzz();
		fb.setValue(value);
		in.close();
		
		String answer = fb.getString();
		System.out.println(answer);
		
	}

}

