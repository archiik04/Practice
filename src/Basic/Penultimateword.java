package Basic;

import java.util.Scanner;

public class Penultimateword {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Input a string : ");
		String line = scanner.nextLine();
		
		//define an array for words
		String[] words = line.split("\\s+");
		// last word - 2
		if (words.length >= 2) {
			String penultimate = words[words.length-2];
			System.out.println("Penultimate word: " + penultimate);
		}
		else {
			System.out.println("Penulatimate word is not found");
		}	
		

	}

}
