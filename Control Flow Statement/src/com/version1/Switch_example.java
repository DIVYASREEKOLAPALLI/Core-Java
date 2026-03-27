package com.version1;
import java.util.Scanner;

public class Switch_example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===========");
		System.out.println("------------");
		System.out.println("Welcome to codegnan");
		System.out.println("----Course offer----");
		System.out.println("----1. python----");
		System.out.println("----2. java----");
		System.out.println("----DSA----");
		System.out.println("-----------");
		
		String course = sc.next().toUpperCase();   //String course = sc.next().toUpperCase();
		switch(course) {
		case "java":
			System.out.println("100 days");
			System.out.println("fee: 40,000");
			break;
			
		case "python":
			System.out.println("90 days");
			System.out.println("fee: 35,000");
			break;
			
		case "DSA":
			System.out.println("100 days");
			System.out.println("fee: 50,000");
			break;
		default:
			System.out.println("we don't offer this course");
		}
	

	}

}
