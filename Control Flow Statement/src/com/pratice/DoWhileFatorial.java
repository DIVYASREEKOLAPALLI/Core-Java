package com.pratice;
import java.util.Scanner;

public class DoWhileFatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		if(sc.hasNextInt()) {
			int num=sc.nextInt();
			int fact = 1;
			int i = 1;
			do {
				fact=fact*i;
				i++;
			}while ( i<=num );
			System.out.println("factorial is"+fact);
		}
		
		
		else {
			System.out.println("only integer ");
		}

	}

}
