package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task02 {

	public static void main(String[] args) {
		// a)
		System.out.println("a)");

		String areaWord = readWord("Bitte gewünschte Fläche eingeben: ");
		double r;
		double w;
		double h;
		double area;

		if(areaWord.equals("Kreis")) {
			r =  readDouble("Bitte gewünschten Radius eingeben: ");
			area = Math.PI * r * r;
			System.out.format("Die Fläche beträgt %.2f FE.", area);
		}
		else if(areaWord.equals("Rechteck")) {
			w =  readDouble("Bitte gewünschte Breite eingeben: ");
			h =  readDouble("Bitte gewünschte Höhe eingeben: ");
			area = w * h;
			System.out.format("Die Fläche beträgt %.2f FE.", area);
		}
		else if(areaWord.equals("Quadrat")) {
			w =  readDouble("Bitte gewünschte Breite eingeben: ");
			area = w * w;
			System.out.format("Die Fläche beträgt %.2f FE.", area);
		}
		else if(areaWord.equals("Dreieck")) {
			w =  readDouble("Bitte gewünschte Breite eingeben: ");
			h =  readDouble("Bitte gewünschte Höhe eingeben: ");
			area = (w * h) / 2;
			System.out.format("Die Fläche beträgt %.2f FE.", area);
		}
		else {
			System.out.println("Unbekannte Form!");
		}

		// b)
		System.out.println("b)");

		areaWord = readWord("Bitte gewünschte Fläche eingeben: ");
		r = 0;
		w = 0;
		h = 0;
		area = 0;

		switch (areaWord) {
		case "Kreis":
			r = readDouble("Bitte gewünschten Radius eingeben: ");
			area = Math.PI * r * r;
			System.out.format("Die Fläche beträgt %.2f FE.", area);
			break;

		case "Rechteck":
			w = readDouble("Bitte gewünschte Breite eingeben: ");
			h = readDouble("Bitte gewünschte Höhe eingeben: ");
			area = w * h;
			System.out.format("Die Fläche beträgt %.2f FE.", area);
			break;

		case "Quadrat":
			w = readDouble("Bitte gewünschte Breite eingeben: ");
			area = w * w;
			System.out.format("Die Fläche beträgt %.2f FE.", area);
			break;

		case "Dreieck":
			w = readDouble("Bitte gewünschte Breite eingeben: ");
			h = readDouble("Bitte gewünschte Höhe eingeben: ");
			area = (w * h) / 2;
			System.out.format("Die Fläche beträgt %.2f FE.", area);
			break;

		default:
			System.out.println("Unbekannte Form!");
			return;
		}
		
	}

}
