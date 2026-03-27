package com.pratice;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter range:");
		int range =sc.nextInt();
		int first=0;
		int second=1;
		System.out.print(first+" "+ second+ "");
		
		for (int i=3; i<=range;i++) {
			int next = first+second ;//formula used for fibonacci pattern to print
			System.out.print(next+"");
			first=second;
			second=next;
		}

	}

}
