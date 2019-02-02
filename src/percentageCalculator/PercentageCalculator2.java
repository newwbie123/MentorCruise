package percentageCalculator;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PercentageCalculator2 {

	public static void main(String[] args) {

		int examPoints;
		double examMaxPoints = 150.0;
		int finalGrade = 0;
		double percentageGrade = 0.0;
		int studentNo = 1;

		double[] grades = new double[5];

		for (int i = 0; i < grades.length; i++) {

			examPoints = input();
			

			percentageGrade = (examPoints / examMaxPoints) * 100;

			System.out.println("Student " + studentNo + " had " + percentageGrade + " %, evaluated status is: ");

			finalGrade = (int) percentageGrade / 10;
			grades[i] = percentageGrade;

			switch (finalGrade) {

			case 0:
			case 1:
			case 2:
				System.out.println("Failed");
				break;

			case 3:
			case 4:
			case 5:
				System.out.println("Good");
				break;

			case 6:
			case 7:
			case 8:
				System.out.println("Very Good");
				break;

			case 9:
			case 10:
				System.out.println("Excellent");
				break;

			default:
				System.out.println("Re-Evaluation needed");
				break;

			}
			studentNo++;

		}

		System.out.println("Percentage achieved, for each Student: " + Arrays.toString(grades));

	}

	public static int input() {

		Scanner scanner = new Scanner(System.in);
		int examPoints = 0;
		boolean loop = true;
		while (loop) {

			try {
				System.out.println("Please enter achieved exam points of the Student:");

				examPoints = scanner.nextInt();

				if (0 <= examPoints && examPoints < 151) {

					return examPoints;

				} else {
					System.out.println("Enter a number between 0 (included) and 150 (included)...");
					loop = true;
				}

			} catch (InputMismatchException exception) {

				System.out.println("Invalid value, please enter a number...");
				scanner.next();
				loop = true;
			}

		}
		scanner.close();
		return -1;
	}

}
