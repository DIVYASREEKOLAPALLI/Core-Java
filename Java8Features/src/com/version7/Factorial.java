package com.version7;

public class Factorial {
	 private int number;

	    public Factorial(int number) {
	        this.number = number;
	    }

	    public long getFactorial() {
	       
	        assert number >= 0 : "Number must not be negative";

	        long fact = 1;
	        for (int i = 1; i <= number; i++) {
	            fact *= i;
	        }

	        return fact;
	    }

}
