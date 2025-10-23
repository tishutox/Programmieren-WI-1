package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task04 {

	public static void main(String[] args) {
        int n = readInteger("Geben Sie eine Ganzzahl >= 0 ein: ");

        // while
        long resultWhile = 1;
        int i = 1;
        while (i <= n) {
            resultWhile *= i;
            i++;
        }
        System.out.println("\nfacultyWhile: " + n + "! = " + resultWhile);

        // do while
        long resultDoWhile = 1;
        i = 1;
        if (n == 0) {
        	
        } else {
            do {
                resultDoWhile *= i;
                i++;
            } while (i <= n);
        }
        System.out.println("\nfacultyDoWhile: " + n + "! = " + resultDoWhile);

        // for
        long resultFor = 1;
        for (i = 1; i <= n; i++) {
            resultFor *= i;
        }
        System.out.println("\nfacultyFor: " + n + "! = " + resultFor);
	}
	
}
