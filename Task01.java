package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task01 {
	
	public static long powerDoWhile(int x, int n) {
		long result = 1;
		
		do {
			if(n > 0) {
				result *= x;
				n--;
			}
		}
		while(n != 0);
		
		return result;
	}
	
	public static long powerWhile(int x, int n) {
		long result = 1;
		
		while(n != 0) {
			result *= x;
			n--;
		}
		
		return result;
	}
	
	public static long powerRecursive(int x, int n) {
		long result = 1;
		
		if(n != 0) {
			result = x * powerRecursive(x, n - 1);
		}
		
		return result;
	}
	
	public static double powerRecursive(double x, int n) {
		double result = 1;
		
		if(n != 0) {
			result = x * powerRecursive(x, n - 1);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int x = readInteger("Geben Sie einen Wert (der natürlichen Menge) für x ein: ");
		int n = readInteger("Geben Sie einen Wert (der natürlichen Menge) für n ein: ");
		double xDouble = readDouble("Geben Sie einen Wert (der reelen Menge) für x ein: ");
		
		System.out.println(powerDoWhile(x, n));
		System.out.println(powerWhile(x, n));
		System.out.println(powerRecursive(x, n));
		System.out.println(powerRecursive(xDouble, n));
	}
	
}
