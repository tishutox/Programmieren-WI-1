package de.tha.wi1;

public class Task01 {

	public static void main(String[] args) {
		int totalSec = 3671; 		// 1 h, 1 min, 11 s
		int a = 7, b = -12; 		// Beispielwerte
		int x = 103; 				// z.B. Prozentwert oder Punktzahl
		int lo = 0, hi = 100; 		// Zielbereich
		double celsius = 23.7; 		// Temperatur in Celsius

		// a)
		int hh = totalSec / 3600;
		int mm = (totalSec % 3600) / 60;
		int ss = totalSec % 60;

		System.out.format("a) hh=%d, mm=%d, ss=%d\n\n", hh, mm, ss);

		// b)
		int minAB = a < b ? a : b;
		int maxAB = a > b ? a : b;

		System.out.format("b) minAB=%d, maxAB=%d\n\n", minAB, maxAB);

		// c)
		int absB = b < 0 ? -b : b;

		System.out.println("c) absB = " + absB + "\n");

		// d)
		int clamped = x < lo ? lo : (x > hi ? hi : x);

		System.out.println("d) clamped = " + clamped + "\n");

		// e)
		double fahrenheit = (9.0 / 5.0) * celsius + 32.0;

		System.out.println("e) fahrenheit = " + fahrenheit);
		
		int i = 11;
		System.out.println(i>>1);
	}

}
