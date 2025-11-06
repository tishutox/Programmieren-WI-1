package de.tha.wi1;

public class Task01 {

	public static void main(String[] args) {
	
		int[] rnd = {
                17, 83, 64, 5, 90, 48, 71, 3, 27, 66,
                14, 95, 9, 56, 78, 22, 60, 99, 2, 31
        };
		
        System.out.print("Schritt 0: ");
        for (int v : rnd) {
            System.out.print(v + " ");
        }
        System.out.println();
        
        for (int i = 0; i < rnd.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < rnd.length; j++) {
                if (rnd[j] < rnd[minIdx]) {
                    minIdx = j;
                }
            }
            
            if (minIdx != i) {
                int tmp = rnd[i];
                rnd[i] = rnd[minIdx];
                rnd[minIdx] = tmp;
            }
            
            System.out.print("Schritt " + (i + 1) + ": ");
            for (int v : rnd) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
        System.out.print("Sortiert: ");
        for (int v : rnd) {
            System.out.print(v + " ");
        }
        System.out.println();
	}
}
