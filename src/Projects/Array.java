package Projects;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {

		int[] numbers = { 5, 2, 8, 1, 9 };

		/* Sum */
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		System.out.println("Sum: " + sum);

		/* Moratab Sazi Sody */
		Arrays.sort(numbers);
		System.out.println("Moratab Sazi Sody: " + Arrays.toString(numbers));
		/* Josto Jo Yek Adad Dar Araye */
		int searchNumber = 8;
		int index = Arrays.binarySearch(numbers, searchNumber);
		if (index >= 0) {
			System.out.println("Adad " + searchNumber + " Vojod Darad Dar index " + index + " Qarar Darad. ");
		} else {
			System.out.println("Adad " + searchNumber + " Dar Araye Vojod Nadarad");
		}
	}
}