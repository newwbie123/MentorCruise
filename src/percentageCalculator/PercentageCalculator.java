package percentageCalculator;

import java.util.Scanner;

public class PercentageCalculator {

	public static void main(String[] args) {

		double[] grades = new double[5];
		Scanner scanner = new Scanner(System.in);
		int examPoints = 0;
		int studentNo = 1;

		try {

			for (int i = 0; i < grades.length; i++) {
				System.out.println("Please enter achieved exam points for the Student no. " + studentNo);

				while (scanner.hasNextInt()) {
					System.out.println("Please enter achieved exam points for the Student no. " + studentNo);
					examPoints = scanner.nextInt();
					double examMaxPoints = 150.0;
					double percentageGrade = (examPoints / examMaxPoints) * 100;

					grades[i] = percentageGrade;
					studentNo++;

					System.out.println("The percentage for Student " + studentNo + " is " + percentageGrade);
					

				}
			}

		} catch (Exception e) {

			e.printStackTrace();
		
		}

		scanner.close();

	}

}
