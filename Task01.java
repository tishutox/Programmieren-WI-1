package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task01 {

	public static void main(String[] args) {
        String word = readWord("Bitte ein Wort eingeben: ");

        // ==
        if (word == "Programmieren") {
            System.out.println("\n== : Das Wort ist \"Programmieren\"\n");
        } else {
            System.out.println("\n== : Das Wort ist NICHT \"Programmieren\"\n");
        }

        // equals()
        if (word.equals("Programmieren")) {
            System.out.println("equals(): Das Wort ist \"Programmieren\"");
        } else {
            System.out.println("equals(): Das Wort ist NICHT \"Programmieren\"");
        }
	}

}
