package Basic;

import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
		
		String req = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
	    count (req);
	  

	}

	private static void count(String req) {
		char [] ch = req.toCharArray();
		int letter = 0;
		int spaces = 0;
		int num = 0;
		int other = 0;
		
		for (int i = 0; i < req.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			}
			
			else if (Character.isSpaceChar(ch[i])) {
				spaces++;
			}
			 else if (Character.isDigit(ch[i])) {
	                num++;
		}
			 else {
				 other++;
			 }
	}
		System.out.println("The string is: Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
        System.out.println("letter: " + letter);
        System.out.println("space: " + spaces);
        System.out.println("number: " + num);
        System.out.println("other: " + other);
		
	}
}


