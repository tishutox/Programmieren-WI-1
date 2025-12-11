package de.tha.wi1;

import java.util.Random;

public class Lottoziehung {
	private Random ran = new Random();
	private int count = 0;
	private int[] numbers6 = new int[6];
	
	
	public int nextNumber() {
		if(count < 6) {
			int rnd = ran.nextInt(1, 50);
			
			for(int i = 0; i < count; i++) {
				if(checkDuplicate(rnd)){
					return nextNumber();
				}
			}
			count++;
			return rnd;
		}
		
		if(count < 7) {
			count++;
			return  ran.nextInt(10);
		}
		
		return -1;
	}
	
	public boolean checkDuplicate(int rnd) {
		for(int i = 0; i < numbers6.length; i++) {
			if(rnd == numbers6[i]) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Lottoziehung lotto = new Lottoziehung();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(lotto.nextNumber());
		}
	}
}
