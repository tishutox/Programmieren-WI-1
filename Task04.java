package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task04 {

	public static void main(String[] args) {
        String pass = "";
        int count = 0;
        
        do {
			pass = readWord("Geben Sie ein Passwort ein: ");
			
			if(pass.equals("StackOverKoala99!")) {
				count++;
			}
		} while (count == 0);
        
        System.out.println("Zutritt genehmigt");
	}
	
}