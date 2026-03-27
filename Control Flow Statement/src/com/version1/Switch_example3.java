package com.version1;
import java.util.Scanner;

public class Switch_example3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===========");
		System.out.println("------------");
		System.out.println("Welcome to codegnan");
		System.out.println("----Course offer----");
		System.out.println("----1. python----");
		System.out.println("----2. java----");
		System.out.println("----3.DSA----");
		System.out.println("-----------");
		
		int course = sc.nextInt();   //String course = sc.next().toUpperCase();
		switch(course) {
		case 2:
			System.out.println("100 days");
			System.out.println("fee: 40,000");
			 // if it is not there
			
		case 1:
			System.out.println("90 days");
			System.out.println("fee: 35,000");
			
			
		case 3:
			System.out.println("100 days");
			System.out.println("fee: 50,000");
			
			break;
		default:
			System.out.println("we don't offer this course");
			
			
		}
	

	}

}
