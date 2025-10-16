package de.tha.wi1;

public class Task03 {

	public static void main(String[] args) {
		int a = 4, b = 0, c = 0;
		boolean d = true;
		float f1 = 0.0f;

		System.out.format("a = %2d, b = %2d, c = %2d, d = %5b, f1 = %.2f%n\n", a, b, c, d, f1);

		// a)
		b = c = a *= 4;

		// b)
		b = c = (a = 3) << 2;

		// c)
		b = (a % 2 == 0) ? a * 2 : a * 5;

		// d)
		d = d && ((a + 1) % 5 == 0);

		// e)
		System.out.format("a = %2d, b = %2d, c = %2d, d = %5b, f1 = %.2f%n", a, b, c, d, f1);
		d = d & ((a = (a + 1) % 5) == 0);
		System.out.format("a = %2d, b = %2d, c = %2d, d = %5b, f1 = %.2f%n", a, b, c, d, f1);

		// f)
		f1 = (a % 10 == 0 && b % 10 == 0) ? a / 3.0f : a * 10.0f;

		// Ausgabe zum Testen
		System.out.format("a = %2d, b = %2d, c = %2d, d = %5b, f1 = %.2f%n", a, b, c, d, f1);
	}

}
