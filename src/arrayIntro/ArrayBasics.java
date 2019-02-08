package arrayIntro;

public class ArrayBasics {

	public static void main(String[] args) {

		int[] arrayPos = { 0, 8, -5, 14, 100 };

		System.out.println("All elements positive, true or false: " + allElementsPositive(arrayPos));

		System.out.println("Index of first negative element is: " + indexOfFirstNegativeElement(arrayPos) + "\n");

		double[] array = { 1, 2, 3, 4, 5, 3 };

		System.out.println("The highest number in array is: " + maxElement(array));

		System.out.println("The average of all elements in array is: " + avgElements(array) + "\n");

		double[] array1 = { 5, 10, 15, 20 };
		double avg = avgElements(array1);

		System.out.println("There are " + greaterThanAvg(array1, avg) + " elements greater than average " + avg);

		int[] array2 = { 1, 2, 2, 5, 2, 5, 4, 3 };

		System.out.println("Number 2 is occured " + occurency(array2, 2) + " times in this array");

		System.out.println("Most occured element in this array is: " + mostOccured(array2));

	}

	// method that returns boolean if all elements are positive (enough is to check if only one value is negative)

	public static boolean allElementsPositive(int[] input) {
		for (int i = 0; i < input.length; i++) {
			if (input[i] < 0) {
				return false;
			}
		}
		return true;
	}

	// method that returns index of first negative element, returns -1 if all elements are positive

	public static int indexOfFirstNegativeElement(int[] input) {
		for (int i = 0; i < input.length; i++) {
			if (input[i] < 0) {
				return i;
			}
		}
		return -1;
	}

	// method that returns index of last negative element in an array

	public static int indexOfLastNegativeElement(int[] input) {
		int index = -1;
		for (int i = 0; i < input.length; i++) {
			if (input[i] < 0) {
				index = i;
			}
		}
		return index;
	}

	// method that returns highest number in array

	public static double maxElement(double[] input) {
		double max = input[0];
		for (int i = 0; i < input.length; i++) {
			if (input[i] > max) {
				max = input[i];
			}
		}
		return max;
	}

	// Method that returns an average of all numbers in an array of doubles

	public static double avgElements(double[] input) {
		double sum = 0;
		double average = 0;
		for (int i = 0; i < input.length; i++) {
			sum = sum + input[i];
			average = sum / input.length;
		}
		return average;
	}

	// Method that returns the number of elements GREATER than the average

	public static int greaterThanAvg(double[] input, double avg) {

		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > avg) {
				count = count + 1;
			}
		}
		return count;

	}

	// Method that counts the number of occurrences of a passed element

	public static int occurency(int[] input, int number) {
		int count = 0;

		for (int i = 0; i < input.length; i++) {
			if (input[i] == number) {

				count = count + 1;

			}

		}
		return count;
	}

	// Method that returns the element that occurs most times
	// Google helped me on this one :]
	
	public static int mostOccured(int[] input) {

		int number = 0;
		int count = 0;

		for (int i = 0; i < input.length; i++) {

			int tempNumber = input[i];
			int tempCount = 0;

			for (int x = 0; x < input.length; x++) {

				if (input[x] == tempNumber)
					tempCount++;

				if (tempCount > count) {
					number = tempNumber;
					count = tempCount;
				}

			}

		}
		return number;

	}

}
