package de.tha.wi1;

public class Task03 {

	public static void main(String[] args) {
		// a)
		int hours   = 1;
		int minutes = 2;
		int seconds = 3;

		System.out.format("\na) Aktuelle Uhrzeit: %02d:%02d:%02d Uhr\n",
				hours, minutes, seconds);

		// b)
		int totalSeconds = 18101;

		int hoursFromSec   = totalSeconds / 3600;
		int minutesFromSec = (totalSeconds % 3600) / 60;
		int secondsFromSec = totalSeconds % 60;

		System.out.format("\nb) %d Sekunden entsprechen: %02d:%02d:%02d Uhr%n",
				totalSeconds, hoursFromSec, minutesFromSec, secondsFromSec);

		// c)
		// ZP A
		int hoursA   = 14;
		int minutesA = 20;
		int secondsA = 33;

		// ZP B
		int hoursB   = 18;
		int minutesB = 31;
		int secondsB = 43;

		// sec seit 24 Uhr
		int secA = hoursA * 3600 + minutesA * 60 + secondsA;
		int secB = hoursB * 3600 + minutesB * 60 + secondsB;

		// Differenz
		int diffSeconds = secB - secA;

		System.out.format("\nc) Zwischen %02d:%02d:%02d Uhr und %02d:%02d:%02d Uhr sind %d Sekunden vergangen.",
				hoursA, minutesA, secondsA, hoursB, minutesB, secondsB, diffSeconds);
	}
}