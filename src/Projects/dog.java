package Projects;

import java.util.Scanner;

public class dog {
	static String animal;

	public void barking() {
		System.out.println("----vogh...vogh");
	}

	public void Sleep() {
		System.out.println("----The dog Sleeping");
	}

	public void eat() {
		System.out.println("----The dog Eating");
	}

	public static void main(String[] args) {

		int age;
		String color;
		String nezhad;
		String name;

		animal = "Dog";
		System.out.println("Animal? " + animal);
		dog dogobject = new dog();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Name dog: ");
		name = s1.next();
		System.out.println("Color dog: ");
		color = s1.next();
		System.out.println("Nezhad dog: ");
		nezhad = s1.next();
		System.out.println("Age dog: ");
		age = s1.nextInt();

		System.out.println("");
		System.out.println("dog Name: " + name + "\n" + "dog Color: " + color + "\n" +
				"dog Age: " + age + "\n" + "dog Nezhad: " + nezhad);

		dogobject.Sleep();

		if (age > 20) {
			System.out.println("Old ");
		} else {
			System.out.println("Yang");
		}
		System.out.println("\n");
		System.out.println("Animal? " + animal);
		dog dogobject2 = new dog();
		System.out.println("Name dog: ");
		name = s1.next();
		System.out.println("Color dog: ");
		color = s1.next();
		System.out.println("Nezhad dog: ");
		nezhad = s1.next();
		System.out.println("Age dog: ");
		age = s1.nextInt();

		System.out.println("");
		System.out.println("dog Name: " + name + "\n" + "dog Color: " + color + "\n" +
				"dog Age: " + age + "\n" + "dog Nezhad: " + nezhad);

		dogobject2.eat();

		if (age > 20) {
			System.out.println("Old ");
		} else {
			System.out.println("Yang");
		}
		System.out.println("\n");
		System.out.println("Animal? " + animal);
		dog dogobject3 = new dog();
		System.out.println("Name dog: ");
		name = s1.next();
		System.out.println("Color dog: ");
		color = s1.next();
		System.out.println("Nezhad dog: ");
		nezhad = s1.next();
		System.out.println("Age dog: ");
		age = s1.nextInt();

		System.out.println("");
		System.out.println("dog Name: " + name + "\n" + "dog Color: " + color + "\n" +
				"dog Age: " + age + "\n" + "dog Nezhad: " + nezhad);

		dogobject3.barking();

		if (age > 20) {
			System.out.println("Old ");
		} else {
			System.out.println("Yang");
		}

	}
}
/*
 * Nam Rang Sen Nezhad Ra Vared Karde Sepas Vazeyat Seni Va
 * Bema Neshan Midahad K Sang Darhale Che Karist
 */