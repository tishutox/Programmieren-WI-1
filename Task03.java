package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task02 {
	
	private static int charConverter(char r) {
		int rInt = 0;
		
		if(r == 'A') {
			rInt = r - 64;
		}else if(r == 'B') {
			rInt = r - 64;
		}else if(r == 'C') {
			rInt = r - 64;
		}else if(r == 'D') {
			rInt = r - 64;
		}else if(r == 'E') {
			rInt = r - 64;
		}else if(r == 'a') {
			rInt = r - 96;
		}else if(r == 'b') {
			rInt = r - 96;
		}else if(r == 'c') {
			rInt = r - 96;
		}else if(r == 'd') {
			rInt = r - 96;
		}else if(r == 'e') {
			rInt = r - 96;
		}
		
		return rInt;
	}
	
	private static void printBoard(char[][] seats) {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
	
	private static int availableSeats(char[][] seats) {
		int availableSeats = 0;
		
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				char dot = '.';
				if(seats[i][j] == dot) {
					availableSeats++;
				}
			}
		}
		
		return availableSeats;
	}
	
	private static char orderSeats(char[][] seats, int rInt, int s) {
		char orderSeats = ' ';
		
		if(seats[rInt][s] == '.') {
			orderSeats = 'x';
		}
		
		else {
			orderSeats = seats[rInt][s];
		}
		
		return orderSeats;
	}
	
	private static void cmdFunction(char[][] seats) {
		System.out.print("Kino-Sitzplan. ");
		System.out.println("Befehle: p | b <row> <seat> | s <row> <seat> | f | q");
		
        char cmd = readChar("> ");
		int count = 0;
        
        do {
			switch(cmd) {
			case 'p':
				printBoard(seats);
				cmd = readChar("> ");
			break;
			case 'b':
				char r = readChar(" ");
				int s = readInteger(" ");
				int rInt = charConverter(r);
				seats[rInt][s] = orderSeats(seats, rInt, s);
				cmd = readChar("> ");
			break;
			case 's':
				System.out.println("See you later, iterator!");
				cmd = readChar("> ");
			break;
			case 'f':
				System.out.println("Freie Plätze: " + availableSeats(seats));
				cmd = readChar("> ");
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
		char seats[][]  = new char[6][9];
		
		for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
            	seats[i][j] = '.';
            }
        }
		
		seats[0][0] = ' ';
		seats[0][1] = '1';
		seats[0][2] = '2';
		seats[0][3] = '3';
		seats[0][4] = '4';
		seats[0][5] = '5';
		seats[0][6] = '6';
		seats[0][7] = '7';
		seats[0][8] = '8';
		
		seats[1][0] = 'A';
		seats[2][0] = 'B';
		seats[3][0] = 'C';
		seats[4][0] = 'D';
		seats[5][0] = 'E';
		
		cmdFunction(seats);
	}

	
}
