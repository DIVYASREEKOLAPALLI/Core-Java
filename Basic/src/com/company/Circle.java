package com.company;

import java.util.Scanner;

public class Circle {
	
	public static void printArea(double radius){
		final double PI=3.14159; //in place of this we ca replace  double area = Math.PI* Math.pow(radius,2);
		double area = PI* radius *radius;
		System.out.println("Area of circle"+area);
		
	}

	public static void printPerimeter(double radius){
		final double PI=3.14159;
		double periMeter = 2* PI * radius;
		System.out.println("peremeter of circle"+periMeter);
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter radius");
		double radius =obj.nextDouble();
		
		printArea(radius);
		printPerimeter(radius);
	
		

	}

}
