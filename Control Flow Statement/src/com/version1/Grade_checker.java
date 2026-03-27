package com.version1;
import java.util.Scanner;

public class Grade_checker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter %:");
		
		if(sc.hasNextDouble()) {
			double percentage = sc.nextDouble();
			if(percentage >=0.00 && percentage<=100.00) {
				if(percentage >=90) {
					System.out.println("A grade");
				}
				else {
					if(percentage >=75) {
						System.out.println("B grade");
					}
					else {
						if(percentage >=55) {
							System.out.println("C grade");
						}
						else {
							if(percentage>=40) {
								System.out.println("D grade");
							} else {
								System.out.println("Fail....");
							}
						}
					}
				}
				
			}
			else {
				System.out.println("enter valid percentage");
			}
		}
		else {
			System.out.println("please enter double value:");
		}
		
		

	}

}
