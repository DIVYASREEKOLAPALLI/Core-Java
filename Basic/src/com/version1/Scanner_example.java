package com.version1;

import java.util.Scanner;

public class Scanner_example {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter Byte value");
		byte a = obj.nextByte();
		
		System.out.println("enter int value");
		int b = obj.nextInt();
		
		System.out.println("enter short value");
		short c = obj.nextShort();
		
		System.out.println("enter long value");
		long d= obj.nextShort();
		
		System.out.println("enter float value");
		float e = obj.nextFloat();
		
		System.out.println("enter Double value");
		double f= obj.nextDouble();
		
		System.out.println("enter Boolean value");
		boolean g = obj.nextBoolean();
		
		System.out.println("enter String value");
		String h = obj.next();
		
		System.out.println(a +" "+b+" "+c+" "+d+" "+e + " "+ f +" "+ g + "  " + h);
	}

}
