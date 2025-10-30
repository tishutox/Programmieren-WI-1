package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task03 {

	public static void main(String[] args) {
		int insertNumb = readInteger("Geben Sie eine beliebige Zahl ein: ");
		
		if((insertNumb % 2 == 0) && (insertNumb > 0)) {
			System.out.println("gerade und positiv");
		}
		
		else if((insertNumb % 2 != 0) && (insertNumb > 0)) {
			System.out.println("ungerade und positiv");
		}
		
		else if(insertNumb < 0) {
			System.out.println("negativ");
		}
		
		else {
			System.out.println("Null");
		}
	}

}