package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task06 {

	public static void main(String[] args) {
		int number = readInteger("Bitte Zahl eingeben: ");

		int n = Math.abs(number);

		int quersumme = 0;
		while (n > 0) {
			int letzteZiffer = n % 10;
			quersumme += letzteZiffer;
			n = n / 10;
		}

		System.out.println("\nDie Quersumme ist: " + quersumme);
	}

}
