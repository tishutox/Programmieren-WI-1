package de.tha.wi1;

public class Task02 {

    public static void main(String[] args) {

        int[][] sudoku = {
                {9,0,0,0,0,0,0,4,0},
                {2,1,6,3,8,4,7,9,0},
                {4,0,0,0,0,9,8,2,1},
                {0,6,0,1,0,0,9,0,0},
                {5,0,1,9,0,8,0,7,6},
                {0,2,9,5,7,6,0,0,8},
                {1,0,4,8,6,5,2,3,7},
                {0,0,7,0,0,0,0,6,4},
                {6,5,2,4,3,7,1,8,9}
        };
        
        System.out.println("|+===+===+===++===+===+===++===+===+===+|");

        for (int row = 0; row < 9; row++) {
            System.out.print("||");
            for (int col = 0; col < 9; col++) {
                int val = sudoku[row][col];
                System.out.print(" " + (val == 0 ? " " : val) + " ");
                
                if ((col + 1) % 3 == 0) {
                    System.out.print("||");
                } else {
                    System.out.print("|");
                }
            }
            System.out.println();
            
            if ((row + 1) % 3 == 0) {
                System.out.println("|+===+===+===++===+===+===++===+===+===+|");
            } else {
                System.out.println("|+---+---+---++---+---+---++---+---+---+|");
            }
        }
    }
}