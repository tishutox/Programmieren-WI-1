package de.tha.wi1;

public class Task06 {

	public static void main(String[] args) {
		int h = 4;
        int count = 1;
        
        for(int i = 0; i < h; i++) {
        	for(int j = 0; j < i + 1; j++) {
        		System.out.format("%3d", count++);
        	}
        	System.out.println();
        	count = 1;
        }
	}

}