package Basic;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Input a string: ");
		char[] words = scanner.nextLine().toCharArray();
		
		System.out.print("Reverse string: ");
		// loop to reverse the string
		for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
        }
		System.out.print("\n");

	}
}