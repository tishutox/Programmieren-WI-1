package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task02 {
	
	public static int ggt(int x, int y) {
		
		if(x == y) {
			return x;
		}
		
		else if(x == 0) {
			return y;
		}
		
		else if(y == 0) {
			return x;
		}
		
		else if((x > y)) {
			return ggt(x - y, x);
		}
		
		else  {
			return ggt(x, y - x);
		}
	}
	
	public static void main(String[] args) {
		int x = readInteger("Geben Sie einen Wert (der natürlichen Menge) für x ein: ");
		int y = readInteger("Geben Sie einen Wert (der natürlichen Menge) für y ein: ");

		System.out.println(ggt(x, y));
		System.out.println(ggt(0, 0));
		System.out.println(ggt(x, 0));
		System.out.println(ggt(0, y));
	}

}
