package de.tha.wi1;

import static de.tha.tools.Window.*;

public class Task03 {
	
	public static void snowflake(int x, int y, int size, int depth) {
		if(depth != 0 || size < 3) {
			snowflake(x, y, size, depth);
			depth--;
		}
		
		drawFilledRectangle(x, y, size, depth, "blue");
		
		return;
	}
	
	public static void main(String[] args) {

		int height = 800;
		int width = 800;
		
        initWindow(width, height, "Schneeflocke");

        int size = 600;               // großes Quadrat, damit man was sieht
        int startX = (width - size) / 2;
        int startY = (height - size) / 2;

        snowflake(startX, startY, size, 3);
		
	}
	
}
