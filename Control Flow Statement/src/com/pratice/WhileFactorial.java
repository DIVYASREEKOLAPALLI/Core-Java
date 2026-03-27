package com.pratice;
import java.util.Scanner;

public class WhileFactorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		if(sc.hasNextInt()) {
			int num=sc.nextInt();
			int fact = 1;
			int i = 1;
			while ( i<=num ) {
				fact=fact*i;
				i++;
			}
			System.out.println("factorial is"+fact);
		}
		
		
		else {
			System.out.println("only integer ");
		}

	}

}
