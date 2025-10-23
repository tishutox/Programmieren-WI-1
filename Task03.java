package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task03 {

	public static void main(String[] args) {
		int paper = readInteger("Bitte gewünschten Ausgabebetrag auf 5 Euro genau angeben: ");

		int eu200 = 0;
		int eu100 = 0;
		int eu50 = 0;
		int eu20 = 0;
		int eu10 = 0;
		int eu5 = 0;
		for(int i = 0; i < 6; i++) {
			if((paper >= 200) && ((paper % 5) == 0)) {
				eu200 = paper / 200;
				paper %= 200;
			}
			else if((paper < 200) && (paper >= 100) && ((paper % 5) == 0)){
				eu100 = paper / 100;
				paper %= 100;
			}
			else if((paper < 100) && (paper >= 50) && ((paper % 5) == 0)){
				eu50 = paper / 50;
				paper %= 50;
			}
			else if((paper < 50) && (paper >= 20) && ((paper % 5) == 0)){
				eu20 = paper / 20;
				paper %= 20;
			}
			else if((paper < 20) && (paper >= 10) && ((paper % 5) == 0)){
				eu10 = paper / 10;
				paper %= 10;
			}
			else if((paper < 10) && (paper >= 5) && ((paper % 5) == 0)){
				eu5 = paper / 5;
			}
		}

		System.out.format("200-Euro Scheine: %d \n100-Euro Scheine: %d"
				+ "\n50-Euro Scheine: %d \n20-Euro Scheine: %d \n10-Euro Scheine: %d"
				+ "\n5-Euro Scheine: %d",
				eu200, eu100, eu50, eu20, eu10, eu5);
	}

}
