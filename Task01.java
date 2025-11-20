package de.tha.wi1;

public class Task01 {
	
	public static int forBig(int[][][] data) {
		int big = Integer.MIN_VALUE;
		
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				for(int k = 0; k < data[i][j].length; k++) {
					if(big <= data[i][j][k]) {
						big = data[i][j][k];
					}
				}
			}
		}
		
		return big;
	}
	
	public static int forEachBig(int[][][] data) {
		int big = Integer.MIN_VALUE;
		
		for(int i[][] : data) {
			for(int j[] : i) {
				for(int k : j) {
					if(big <= k) {
						big = k;
					}
				}
			}
		}
		
		return big;
	}

	public static void main(String[] args) {
		
        // Beispiel-Array mit unregelmäßigen Dimensionen
        int[][][] data = {
            { {1, 2, 3}, {4, 5} },
            { {10}, {20, 30, 40}, {50} },
            { {7, 8}, {}, {11, 12, 13, 14} }
        };
        
        System.out.println(forBig(data));
        System.out.println();
        System.out.println(forEachBig(data));
		
	}
	
}
