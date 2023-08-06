package Projects;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int minAge = Integer.MAX_VALUE;
		int maxAge = Integer.MIN_VALUE;

		for (int i = 1; i <= 3; i++) {
			System.out.print("Enter age of user " + (i) + ": ");
			int age = scanner.nextInt();
			if (age > maxAge) {
				maxAge = age;
			}
			if (age < minAge) {
				minAge = age;
			}
		}
		System.out.println("---Maximum age: " + maxAge);
		System.out.println("---Minimum age: " + minAge);

	}
}
/* Sen 3 Karbar Ra Daryaf: Max Min Sen ha Ra Namayesh midahad */