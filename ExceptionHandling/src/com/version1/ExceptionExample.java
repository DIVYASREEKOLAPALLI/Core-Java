package com.version1;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter a value:");
		int a =sc.nextInt();
		
		System.out.println("enter b value:");
		int b =sc.nextInt();
		
		
		
		try {
			int c=a/b;
			
			System.out.println("division is"+c);
		}
		catch (ArthimeticException e) {
			System.out.println("hello user don't enter b value as zero....");
		}


	}

}
