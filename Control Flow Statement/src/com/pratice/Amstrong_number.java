package com.pratice;
import java.util.Scanner;

public class Amstrong_number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Factorial factorial = new Factorial();
		System.out.println("enter a number");
		if(sc.hasNextInt()) {
			int num=sc.nextInt();
			int original_number=num;
			int sum=0;
			while(num>0) {
				int digit =num%10;
				sum=sum+factorial.fact(digit);
				num=num/10;
			}
			if(sum==original_number){
				System.out.println("is a strong number");
			}
			else {
				System.out.println("not a strong number");
			}
		}
		else {
			System.out.println("enter number only...");
		}

	}

}
