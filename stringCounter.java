//Anthony Malgapo
//Sept. 16, 2016
//Slack Problem 1

//Create a program that asks users to input a string,
//then count how many uppercase, lowercase, numbers, and
//other characters there are in the string.

import java.util.*;

public class stringCounter {
	
	public static void main(String[] args){

		String userString;
		char[] charArray;

		Scanner input = new Scanner(System.in);

		//User input
		System.out.println("\nThis program will count all the characters in your string!");
		System.out.print("\nPlease enter your string: ");
		userString = input.nextLine();
		//User output
		System.out.println("\nYour string is: " + userString);
		//Taking this String and putting it into a character array
		charArray = userString.toCharArray();
		//Output on total characters (includes every single keyboard press)
		System.out.println("\n\nThe total characters in this string is: " + charArray.length);

		counter(charArray);
		
	}

	public static void counter(char[] z){

		int lowerCounter = 0;
		int upperCounter = 0;
		int numCounter = 0;
		int specCounter = 0;
		char letter = 'a';

		for (int i = 0; i < z.length; i++){

			letter = z[i];

			if (Character.isLowerCase(letter)){
				lowerCounter++;
			}
			if (Character.isUpperCase(letter)){
				upperCounter++;
			}
			if (Character.isDigit(letter)){
				numCounter++;
			}
			
		}
		//Note: Finding a way to count the special characters in the if statement was too complicated to
		//understand when trying to use Character Class, I used a simple calculation here.
		specCounter = z.length - lowerCounter - upperCounter - numCounter;

		System.out.println("Total lowercase characters: " + lowerCounter);
		System.out.println("Total uppercase characters: " + upperCounter);
		System.out.println("Total number characters: " + numCounter);
		//Spacing is counted here as a special character but may be distinguishable somehow.
		System.out.println("Total special characters: " + specCounter + " (Spacing count is included here.)\n\n");

	}
}