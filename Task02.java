package de.tha.wi1;

public class Task02 {
	
	public static boolean checkMethod(int[] allValues, int[] check) {
		boolean returnValue = false;
		int checkValue = 0;
		
		for(int i : check) {
			for(int j : allValues) {
				if(i == j) {
					checkValue++;
					break;
				}
			}
		}
		
		if(check.length == 0) {
			returnValue = true;
		}
		
		if(allValues.length == 0) {
			returnValue = false;
		}
		
		if(checkValue == check.length) {
			returnValue = true;
		}
		
		return returnValue;
	}
	
	public static void main(String[] args) {
		int[] allValues = {1, 3, 5, 7, 9, 11};
		int[] check = {3, 7, 9};
		
		System.out.println(checkMethod(allValues, check));
	}
	
}
