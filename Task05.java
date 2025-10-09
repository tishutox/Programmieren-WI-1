package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task05 {

	public static void main(String[] args) {
		// a)
		System.out.print("Geben Sie den Netto‑Preis ein: ");
		float nettoEuro = readFloat();
		System.out.format("Eingegebener Netto‑Preis: %.2f Euro\n\n", nettoEuro);

		// b)
		float brutto19 = nettoEuro * 1.19f;
		float brutto7  = nettoEuro * 1.07f;

		System.out.format("Preis mit 19%% MwSt: %.2f Euro\n", brutto19);
		System.out.format("Preis mit 7%% MwSt : %.2f Euro\n\n", brutto7);

		// c)
		int nettoCent = Math.round(nettoEuro * 100);

		// Umrechnung in Ct
		int brutto19Cent = Math.round(nettoCent * 1.19f);
		int brutto7Cent  = Math.round(nettoCent * 1.07f);

		// Ausgabe in Ct
		System.out.format("Eingegebener Netto‑Preis: %d Cent\n", nettoCent);

		// Ct zu €
		System.out.format("Preis mit 19%% MwSt: %s Euro\n",
				centsToEuroString(brutto19Cent));
		System.out.format("Preis mit 7%% MwSt : %s Euro\n",
				centsToEuroString(brutto7Cent));
	}

	private static String centsToEuroString(int cents) {
		int euro = cents / 100;          // Ganze Euro
		int cent = cents % 100;          // Rest‑Cent (0–99)
		return String.format("%d.%02d", euro, cent);
	}
}