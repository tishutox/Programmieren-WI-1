package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task03 {

    private static int charConverter(char r) {
        if (Character.isUpperCase(r)) {
            return r - 'A' + 1;
        } else {
            return r - 'a' + 1;
        }
    }

    private static void printBoard(char[][] seats) {
        System.out.print("  ");
        for (int col = 1; col < seats[0].length; col++) {
            System.out.print(col + " ");
        }
        System.out.println();

        for (int row = 1; row < seats.length; row++) {
            System.out.print((char) ('A' + row - 1) + " ");
            for (int col = 1; col < seats[row].length; col++) {
                System.out.print(seats[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int availableSeats(char[][] seats) {
        int free = 0;
        for (int i = 1; i < seats.length; i++) {
            for (int j = 1; j < seats[i].length; j++) {
                if (seats[i][j] == '.') free++;
            }
        }
        return free;
    }

    private static void bookSeat(char[][] seats, int row, int col) {
        if (row < 1 || row > 5 || col < 1 || col > 8) {
            System.out.println("Ungültiger Sitz!");
            return;
        }
        if (seats[row][col] == '.') {
            seats[row][col] = 'x';
            System.out.println("Gebucht.");
        } else if (seats[row][col] == 'x') {
            System.out.println("Sitz bereits belegt!");
        } else {
            System.out.println("Ungültiger Sitz!");
        }
    }

    private static void cancelSeat(char[][] seats, int row, int col) {
        if (row < 1 || row > 5 || col < 1 || col > 8) {
            System.out.println("Ungültiger Sitz!");
            return;
        }
        if (seats[row][col] == 'x') {
            seats[row][col] = '.';
            System.out.println("Storniert.");
        } else if (seats[row][col] == '.') {
            System.out.println("Sitz nicht belegt!");
        } else {
            System.out.println("Ungültiger Sitz!");
        }
    }

    private static void cmdFunction(char[][] seats) {
        System.out.println("Kino-Sitzplan. Befehle: p | b <row> <seat> | s <row> <seat> | f | q");
        while (true) {
            char cmd = readChar("> ");

            switch (cmd) {
                case 'p':
                    printBoard(seats);
                    break;

                case 'b': {
                    char r = readChar();
                    int s = readInteger();
                    int rowIdx = charConverter(r);
                    bookSeat(seats, rowIdx, s);
                    break;
                }

                case 's': {
                    char r = readChar();
                    int s = readInteger();
                    int rowIdx = charConverter(r);
                    cancelSeat(seats, rowIdx, s);
                    break;
                }

                case 'f':
                    System.out.println("Freie Plätze: " + availableSeats(seats));
                    break;

                case 'q':
                    System.out.println("See you later, iterator!");
                    System.exit(0);
                    break;

                default:
                    System.out.print("Unbekannter Befehl. ");
                    System.out.println("Befehle: p | b <row> <seat> | s <row> <seat> | f | q");
                    break;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        char[][] seats = new char[6][9];

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = '.';
            }
        }

        seats[0][0] = ' ';
        for (int j = 1; j <= 8; j++) {
            seats[0][j] = (char) ('0' + j);
        }

        seats[1][0] = 'A';
        seats[2][0] = 'B';
        seats[3][0] = 'C';
        seats[4][0] = 'D';
        seats[5][0] = 'E';

        cmdFunction(seats);
    }
}
