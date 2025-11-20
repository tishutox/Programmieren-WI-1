package de.tha.wi1;

public class Task06 {
	
	public static void drawProfile(int[] profile) {
		char[][] map = new char[getMapHeight(profile)][profile.length];
		
		initMap(map);
		
		printMap(map);
	}
	
	public static int getMapHeight(int[] profile) {
		int returnValue = 0;
		
		for(int i : profile) {
			returnValue++;
		}
		
		return returnValue;
	}
	
	public static void initMap(char[][] map) {
		for(int i = 0; 0 < map.length; i++) {
			for(int j = 0; 0< map.length; j++) {
				map[i][j] = ' ';
			}
		}
	}
	
	public static void printMap(char[][] map) {
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map.length; j++) {
				System.out.println(map[i][j]);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] profile = {0, 1, 2, 3, 4, 3, 2, 3, 4, 4, 4, 4, 5, 6, 5, 4, 3, 2, 1, 0};
		
		System.out.println(getMapHeight(profile));
	}
	
}
