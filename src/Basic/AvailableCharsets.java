package Basic;

import java.nio.charset.Charset;

public class AvailableCharsets {

	public static void main(String[] args) {
		System.out.println("List of avaliable character sets: ");
		for (String str: Charset.availableCharsets().keySet()) {
			System.out.println(str);
		}

	}

}
