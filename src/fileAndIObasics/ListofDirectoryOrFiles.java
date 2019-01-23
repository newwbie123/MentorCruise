package fileAndIObasics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ListofDirectoryOrFiles {

	public static void main(String[] args) {

		String text = "This is test input line for the new file.";
		String text2 = "This is another test input line for the second new file.";

		File file1 = new File("TestExample1.txt");
		File file2 = new File("TestingExample2.txt");
		File file3 = new File("C:\\Users\\Ivan\\eclipse-workspace\\MentorCruise");

		// block to create first file and send some text in it
		try {

			if (file1.createNewFile()) {
				FileWriter writer = new FileWriter(file1);
				BufferedWriter output = new BufferedWriter(writer);
				output.write(text);
				output.close();
				System.out
						.println("File " + file1 + " created and output |" + text + "| succesfully added to new file.");
			} else {
				System.out.println("The file with the same name already exists.");
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println();

		// block to create second file and send some text in it
		try {

			if (file2.createNewFile()) {
				FileWriter writer2 = new FileWriter(file2);
				BufferedWriter output2 = new BufferedWriter(writer2);
				output2.write(text2);
				output2.close();
				System.out.println(
						"File " + file2 + " created and output |" + text2 + "| succesfully added to new file.");
			} else {
				System.out.println("The file with the same name already exists.");
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

		// to get a list of all file/directory names from my MentorCruise folder

		String names[] = file3.list();
		System.out.println();
		System.out.println("List of files in location C:\\Users\\Ivan\\eclipse-workspace\\MentorCruise is:");

		for (String filename : names) {

			System.out.println("-> " + filename);
		}

		// comparing the file names

		System.out.println();
		int lexChecker = file1.compareTo(file2);
		if (lexChecker == 0) {
			System.out.println("File names are the same.");
		} else {
			System.out.println("File names are different.");
		}

		// checking lexicographic order

		System.out.println();
		if (lexChecker < 0) {
			System.out.println("\"" + file1 + "\"" + " is lexicographically higher than " + "\"" + file2 + "\"");
		} else if (lexChecker == 0) {
			System.out.println(file1 + " is lexicographically  equal to " + file2);
		} else if (lexChecker > 0) {
			System.out.println(file1 + " is lexicographically less than " + file2);
		}

	}

}
