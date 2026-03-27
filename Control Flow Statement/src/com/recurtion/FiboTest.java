package com.recurtion;
import java.util.Scanner;

public class FiboTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter range");
		int range = sc.nextInt();
		
		for(int i=0; i<range; i++) {
			System.out.print(Fibonacci.fibo(i)+" ");
		}
		

	}

}
