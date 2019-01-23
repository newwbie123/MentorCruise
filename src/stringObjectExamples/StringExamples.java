package stringObjectExamples;

import java.util.Scanner;

public class StringExamples {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name and press enter...");

		String string1 = input.nextLine();
		String string2;

		System.out.println("Please enter number between 0 and 4 and press enter...");

		int numIndex = 0;

		boolean isCorrect;

		// supposing the name input has at least 4 characters
		do {
			numIndex = input.nextInt();
			if (numIndex > 0 && numIndex < 4) {

				isCorrect = true;

			} else {
				System.out.println("The number you entered is not between 0 and 4, try again...");

				isCorrect = false;

			}
		} while (!(isCorrect));

		System.out.println("The character on the position no. " + numIndex + " of name " + string1 + " is " + "|"
				+ string1.charAt(numIndex - 1) + "|");

		System.out.println("Please write another random name and press enter...");

		input.nextLine();
		
		string2 = input.nextLine();
		String string3 = string1.concat(string2);

		System.out.println("Name " + string2 + " has length of " + string2.length()
				+ " and modified with |Caps on| becomes --> " + string2.toUpperCase());
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("If we concatenate both names, we get: " + string3);

		input.close();
	}

}
