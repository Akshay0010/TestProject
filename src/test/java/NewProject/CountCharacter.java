package NewProject;

public class CountCharacter {

	public static void main(String[] args) {
	      String inputString = "Deven Dighe";
	        char targetChar = 'e'; // You can also use 'D' for counting uppercase 'D'

	        int count = 0;

	        for (int i = 0; i < inputString.length(); i++) {
	            char currentChar = inputString.charAt(i);

	            // Check if the current character matches the target character
	            if (currentChar == targetChar || currentChar == Character.toUpperCase(targetChar)) {
	                count++;
	            }
	        }

	        System.out.println("The letter '" + targetChar + "' appears " + count + " times in the string.");
	    }
	

	}


