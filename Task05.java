package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task05 {

	public static void main(String[] args) {
		int x = readInteger("Geben Sie eine Ganzzahl >= 0 ein: ");

		// while
		long sumWhile = 0;
		int i = 0;
		while (i <= x) {
			if (i % 2 == 0) {
				sumWhile += i;
			}
			i++;
		}
		System.out.println("\nsumWhile: " + sumWhile);

		// do while
		long sumDoWhile = 0;
		i = 0;
		if (x >= 0) {
			do {
				if (i % 2 == 0) {
					sumDoWhile += i;
				}
				i++;
			} while (i <= x);
		}
		System.out.println("\nsumDoWhile: " + sumDoWhile);

		// for
		long sumFor = 0;
		for (i = 0; i <= x; i++) {
			if (i % 2 == 0) {
				sumFor += i;
			}
		}
		System.out.println("\nsumFor: " + sumFor);
	}

}
