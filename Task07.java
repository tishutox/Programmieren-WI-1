package de.tha.wi1;

import static de.tha.tools.Input.*;

import java.util.Iterator;

public class Task07 {

	public static void main(String[] args) {
		int h = readInteger("Bitte Höhe des Baumes (h) eingeben: ");

		for (int row = 1; row <= h; row++) {

			for (int spaces = 0; spaces < h - row; spaces++) {
				System.out.print(" ");
			}

			for (int stars = 0; stars < 2 * row - 1; stars++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = 0; i < h - 1; i++) {
			System.out.print(" ");
		}
		System.out.println("#");
	}

}
