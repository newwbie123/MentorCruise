package sumEvenNumbers;

import java.util.Scanner;

public class SumEvenNumbers {

	public static void main(String[] args) {

		int size;
		System.out.println("Please enter a number for Array range.");
		Scanner scanner = new Scanner(System.in);
		size = scanner.nextInt();
		scanner.nextLine();

		int[] array = new int[size];

		for (int i = 0; i < array.length; i++) {

			boolean isEven;

			do {
				System.out.println("Enter an even number");
				if ((scanner.nextInt() % 2 == 0)) {

					int number = scanner.nextInt();
					scanner.nextLine();

					isEven = true;

					array[i] = number;

				} else {
					System.out.println("The number you entered is not even");
					isEven = false;

				}
			} while (!(isEven));

		}
		
		scanner.close();

		int sum = sumEvenNumbers(array);
		System.out.println("Sum of all even numbers is " + sum);

	}

	public static int sumEvenNumbers(int[] array) {

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

}
