package com.codegnan.serves_03;

public class Typecasting {

	public static void main(String[] args) {
		//widening
		
		byte b= 10;
		short s=b;
		System.out.println(b);
		System.out.println(s);
		
		char c='A';
		int i =c;
		System.out.println(c);
		System.out.println(i);
		
		
		long l=100l;
		float f= l;
		System.out.println(l);
		System.out.println(f);
		
		//narrowing
		
		byte b1= 10;
		short s1=b;
		System.out.println(b1);
		System.out.println(s1);
		
		char c1='A';
		int i1 =c;
		System.out.println(c1);
		System.out.println(i1);
		
		float f1=10.3f;
		long l1=(long)f1;
		System.out.println(f1);
		System.out.println(l1);

	}

}
