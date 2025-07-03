package Basic;

import java.util.Scanner;

public class Reverseword {

	public static void main(String[] args) {
		// reverse
		Scanner scanner = new Scanner (System.in);
		System.out.println("Input a word: ");
		String word = scanner.next();
		
		word = word.trim(); //empty spaces removal
		
		String reverse = ""; //to store string
		char[] rev = word.toCharArray(); //character array 
		// backward for loop to reverse
		for (int i=rev.length-1; i>=0; i--){
			reverse += rev[i];
		}
		
		System.out.println("Reverse word: " + reverse.trim());

	}

}
