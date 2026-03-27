package com.version1;
import java.util.Scanner;

public class EligibilityChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you age:");
		if(sc.hasNextInt()) {        //it checks the condition is true data type 
			int age = sc.nextInt();
			if(age >=0 && age <= 100) {
				if(age>=18) {
					System.out.println("you are eligible for vote");
				}
				else {
					System.out.println("you are not eligible for vote");
				}
				
			}
			else {
				System.out.println("Please enter numb between 0 - 100");
			}
		}
		else {
			System.out.println("please enter valid integer");
		}

	}

}
