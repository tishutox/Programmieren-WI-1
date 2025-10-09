package de.tha.wi1;

public class Task01 {

	public static void main(String[] args) {
		int dezimal   = 80;
		int binary    = Integer.parseInt("1110010", 2);
		int dezimal2  = 111;
		int hex       = Integer.parseInt("67", 16);
		int octal     = Integer.parseInt("61", 8);

		char cDezimal   = (char) dezimal;
		char cBinary    = (char) binary;
		char cDezimal2  = (char) dezimal2;
		char cHex       = (char) hex;
		char cOctal     = (char) octal;

		System.out.println("" + cDezimal + cBinary + cDezimal2 + cHex + cOctal);
	}
}