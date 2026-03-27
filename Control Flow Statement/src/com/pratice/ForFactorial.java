package com.pratice;
import java.util.Scanner;

public class ForFactorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		if(sc.hasNextInt()) {
			int num=sc.nextInt();
			int fact = 1;
			for (int i = 1; i<=num; i++) {
				fact=fact*i;
			}
			System.out.println("factorial is"+fact);
		}
		
		
		else {
			System.out.println("only integer ");
		}

	}

}
