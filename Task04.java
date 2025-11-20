package de.tha.wi1;

import static de.tha.tools.Window.*;

import java.awt.Color;

public class Task04 {
	public static void drawCheckBoard(int col, int row) {
		initWindow(800, 800, "Schachbrett");
		int w = 800 / row;
		int h = 800 / col;
		
		
		for(int i = 0; i < row; i += 1) {
			for(int j = 0; j < col; j += 1) {
				if( (i+j)% 2 != 0) {
					drawFilledRectangle(i * w, j * h, w, h, "black");
				}
				
				else {
					drawFilledRectangle(i * w, j * h, w, h,  "white");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		drawCheckBoard(8, 8);
	}
	
}
