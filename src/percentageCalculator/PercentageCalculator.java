package percentageCalculator;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PercentageCalculator {

	public static void main(String[] args) {

		double[] grades = new double[5];
		Scanner scanner = new Scanner(System.in);
		int examPoints = 0;
		int studentNo = 1;
		double examMaxPoints = 150.0;

		boolean loop = true;

		while (loop) {

			try {
				for (int i = 0; i < grades.length; i++) {

					System.out.println("Please enter achieved exam points of the Student no. " + studentNo);
					examPoints = scanner.nextInt();

					double percentageGrade = (examPoints / examMaxPoints) * 100;
					System.out.println("Student no. " + studentNo + " had " + percentageGrade + " %, evaluated status: ");

					grades[i] = percentageGrade;

					int finalGrade = (int) percentageGrade / 10;
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
					loop = false;

				}
			} catch (InputMismatchException exception) {

				System.out.println("Invalid value, please enter a number...");
				scanner.next();
				loop = true;
			}

		}

		System.out.println("Percentage achieved, for each Student: " + Arrays.toString(grades));

		scanner.close();

	}

}
