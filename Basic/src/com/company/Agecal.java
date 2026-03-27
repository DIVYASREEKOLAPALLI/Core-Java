package com.company;
import java.util.Scanner;

public class Agecal {

	public static void main(String[] args) {
		final int CURRENT_YEAR =2026;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter your birth year");
		int birth_year =obj.nextInt();
		
		int age = CURRENT_YEAR - birth_year;
		System.out.println("you are approximately"+ age+ "year old in"+ CURRENT_YEAR);
		

	}

}
