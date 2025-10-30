package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task02 {

	public static void main(String[] args) {
		int insertMon = readInteger("Bitte gewünschten Betrag in Cent eingeben: ");

		if(insertMon >= 200) {
			System.out.println(" 2-Euro Münzen: " + insertMon / 200);
			insertMon %= 200;
		}
		else {
			System.out.println(" 2-Euro Münzen: " + 0);
		}
		
		if((insertMon >= 100) && (insertMon < 200)) {
			System.out.println(" 1-Euro Münzen: " + insertMon / 100);
			insertMon %= 100;
		}
		else {
			System.out.println(" 1-Euro Münzen: " + 0);
		}
		
		if((insertMon >= 50) && (insertMon < 100)) {
			System.out.println("50-Cent Münzen: " + insertMon / 50);
			insertMon %= 50;
		}
		else {
			System.out.println("50-Cent Münzen: " + 0);
		}
		
		if((insertMon >= 20) && (insertMon < 50)) {
			System.out.println("20-Cent Münzen: " + insertMon / 20);
			insertMon %= 20;
		}
		else {
			System.out.println("20-Cent Münzen: " + 0);
		}
		
		if((insertMon >= 10) && (insertMon < 20)) {
			System.out.println("10-Cent Münzen: " + insertMon / 10);
			insertMon %= 10;
		}
		else {
			System.out.println("10-Cent Münzen: " + 0);
		}
		
		if((insertMon >= 5) && (insertMon < 10)) {
			System.out.println(" 5-Cent Münzen: " + insertMon / 5);
			insertMon %= 5;
		}
		else {
			System.out.println(" 5-Cent Münzen: " + 0);
		}
		
		if((insertMon >= 2) && (insertMon < 5)) {
			System.out.println(" 2-Cent Münzen: " + insertMon / 2);
			insertMon %= 2;
		}
		else {
			System.out.println(" 2-Cent Münzen: " + 0);
		}
		
		if((insertMon >= 1) && (insertMon < 2)) {
			System.out.println(" 1-Cent Münzen: " + insertMon / 1);
			insertMon %= 1;
		}
		else {
			System.out.println(" 1-Cent Münzen: " + 0);
		}
	}

}