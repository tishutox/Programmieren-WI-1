package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task03 {
	
	public static boolean checkPalindrom(char[] palindromArray) {
		int len = palindromArray.length;
		
	    for (int i = 0; i < len / 2; i++) {
	        if (palindromArray[i] != palindromArray[len - 1 - i]) {
	            return false;
	    	}
	    }
	    
	    return true;
	}
	
	public static char[] palindromLowerCase(char[] palindromArray) {
		for(int i = 0; i < palindromArray.length; i++) {
			if(palindromArray[i] >= 'A' && palindromArray[i] <= 'Z') {
				palindromArray[i] = (char) (palindromArray[i] - 'A' + 'a'); 
			}
		}
		
		return palindromArray;
	}
	
	public static void main(String[] args) {
		String palindrom = readWord("Geben Sie hier ein Wort ein: ");
		
		char[] palindromArray = palindrom.toCharArray();
		
		palindromArray = palindromLowerCase(palindromArray);
		
		if(checkPalindrom(palindromArray) == true) {
			System.out.println(palindrom + " ist ein Palindrom");
		}
		
		else {
			System.out.println(palindrom + " ist kein Palindrom");
		}
		
	}
	
}
