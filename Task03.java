package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task03 {
	
	private static void cmdFunction() {
		System.out.print("Kino-Sitzplan. ");
		System.out.println("Befehle: p | b <row> <seat> | s <row> <seat> | f | q");
		
        char cmd = readChar("> ");
		int count = 0;
        
        do {
			switch(cmd) {
			case 'p':
				System.out.println("See you later, iterator!");
				count++;
			break;
			case 'b':
				System.out.println("See you later, iterator!");
				count++;
			break;
			case 's':
				System.out.println("See you later, iterator!");
				count++;
			break;
			case 'f':
				System.out.println("See you later, iterator!");
				count++;
			break;
			case 'q':
				System.out.println("See you later, iterator!");
				System.exit(0);
			break;
			default:
				System.out.print("Unbekannter Befehl. ");
				System.out.println("Befehle: p | b <row> <seat> | s <row> <seat> | f | q");
				cmd = readChar("> ");
			}
		} while(count == 0);
	}

	public static void main(String[] args) throws Exception {
		cmdFunction();
		
		char r = readChar();
		int s = readInteger();
		
		System.out.println("test");
	}

	
}
