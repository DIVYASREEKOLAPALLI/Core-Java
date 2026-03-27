package com.recurtion;

public class Factorial {
	
	public static int getFactorial (int number) {
		if(number == 0 || number == 1) {
			return 1;
			
		} else {
			return number*getFactorial(number-1);
		}
		
	}

}
