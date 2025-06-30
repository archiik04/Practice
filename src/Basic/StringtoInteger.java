package Basic;

import java.util.Scanner;

public class StringtoInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Input a number: ");
		// to read the input from the user
		String userInput = scanner.nextLine(); 
		try {
			int number = Integer.parseInt(userInput);
			System.out.printf("The integer value is: %d%n", number);
		} 
		catch (NumberFormatException e) {
			System.out.println("not a valid number!");
		}
		

	}

}
