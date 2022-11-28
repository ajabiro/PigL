import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
			Scanner scnr = new Scanner(System.in);
			
			String keepGoing = null;
			do {
			
			System.out.println("Please enter a word to convert to pig latin: ");
			String word = scnr.nextLine();

			System.out.println(translate(word));
			
		System.out.println("Would you like to do another?");
		keepGoing = scnr.nextLine();
			} while ("yes".equalsIgnoreCase(keepGoing ));
			
		System.out.println("Bye!");
		scnr.close();
		
		}

	
	public static boolean isVowel(char ch) {
	return (ch == 'a' || ch == 'e' ||ch == 'i' || ch == 'o' || ch == 'u');
	
	}
		public static String translate (String userWordInput) {
		
		String userInput = userWordInput.toLowerCase();
		
		int stringlength = userInput.length();
		
		int index = -1;
		String output = "";
		String pigLatin = "";
		
		for (int i=0; i<stringlength; i++) {
			
			if (isVowel(userInput.charAt(i))){   
				index=i;
				
			    output = userInput.substring(index) + userInput.substring(0, index);  

			
				break;
			}
			
		}
			pigLatin = output + (isVowel(userInput.charAt(0))  ? "way" : "ay");
	  		
			return pigLatin;
			
		
		
		
		}
	
}