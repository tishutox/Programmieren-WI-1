package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task04 {

	public static void main(String[] args) {
		int year = readInteger("Jahreszahl eingeben: ");

		boolean leap = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);

		System.out.println(year + (leap ? " ist ein Schaltjahr." : " ist kein Schaltjahr."));
	}

}
