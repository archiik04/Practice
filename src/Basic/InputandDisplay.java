package Basic;

public class InputandDisplay {

	public static void main(String[] args) {
		int counter = 0;
		// loop for 3 digit numbers
		for (int i= 1; i<=4; i++) {
			for (int j=1; j<=4; j++){
				for (int k=1; k<=4; k++){
					if (k != i && k != j && i !=j) {
						counter++;
						System.out.println(i + "" + j + "" + k);
					}
				}
			}
		}
	
	 System.out.println("number of the three-digit-number is " + counter);

}
}
	
