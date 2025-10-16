package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task05 {

	public static void main(String[] args) {

		int age = readInteger("Bitte Alter eingeben: ");

		int height = readInteger("Bitte Größe in cm eingeben: ");

		int weight = readInteger("Bitte Gewicht in Kilogramm eingeben: ");

		double activity = readDouble("Bitte Aktivitätsfaktor eingeben: ");

		// a)
		System.out.println("\na)");

		// Grundumsatz
		double basalMan  = 10 * weight + 6.25 * height - 5 * age + 5;
		double basalWoman = 10 * weight + 6.25 * height - 5 * age - 161;

		// Gesamtumsatz
		double totalMan  = basalMan  * activity;
		double totalWoman = basalWoman * activity;

		System.out.format("Gesamtumsatz Mann: %.0f kcal pro Tag\n", totalMan);
		System.out.format("Gesamtumsatz Frau: %.0f kcal pro Tag\n", totalWoman);

		// b)
		int totalConsumptionMan  = (int)Math.round((10 * weight + 6.25 * height - 5 * age + 5) * activity);
		int totalConsumptionWoman = (int)Math.round((10 * weight + 6.25 * height - 5 * age - 161) * activity);

		// c)
		System.out.println("\nc)");
		
		boolean calculateForWoman = false;
		int total = calculateForWoman
				? (int)Math.round((10 * weight + 6.25 * height - 5 * age - 161) * activity)
						: (int)Math.round((10 * weight + 6.25 * height - 5 * age + 5) * activity);

		System.out.println("Auswahl über Boolean:");
		System.out.println(calculateForWoman ? "Frau" : "Mann" + ": " + total + " kcal");
	}

}
