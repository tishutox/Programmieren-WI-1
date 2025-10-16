package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task06 {

	public static void main(String[] args) {		
		// 16. Oktober 2025
		int day = 16;
		int month = 10;
		// int year = 2025;

		int d = readInteger("Tag: ");
		int m = readInteger("Monat (1‑12): ");
		int year = readInteger("Jahr: ");

		// Jan und Feb
		if (m == 1 || m == 2) {
			m += 12;
			year -= 1;
		}

		int c = year / 100; // erste zwei Stellen
		int y = year % 100; // letzte zwei Stellen

		// Zellers Formel
		int w = (d
				+ (26 * (m + 1)) / 10
				+ (5 * y) / 4
				+ (c / 4)
				+ 5 * c
				- 1) % 7;

		// Sicherstellen, dass w positiv ist (Java kann negative Modulo‑Ergebnisse liefern)
		if (w < 0) w += 7;

		String[] names = {"Sonntag", "Montag", "Dienstag", "Mittwoch",
				"Donnerstag", "Freitag", "Samstag"};

		System.out.printf("\nDer %02d.%02d.%d ist ein %s (Wochentag: %d).\n",
				d, (m > 12 ? m - 12 : m), (m > 12 ? year + 1 : year),
				names[w], w);
	}

}
