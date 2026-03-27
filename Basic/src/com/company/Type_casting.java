package com.company;

public class Type_casting {

	public static void main(String[] args) {
		
		//implicit type convertion  ( convert smaller data type to larger data type)
		
		short a =10;//smaller datatype
		
		int b = a ;//larger data type
		System.out.println(b);
		
		//explicit
		
		double d = 5.84558752215;//larger
		int n = (int)d; //smaller so only 4bytes space so it stores only 5
		
		System.out.println(n);		
				

	}

}
