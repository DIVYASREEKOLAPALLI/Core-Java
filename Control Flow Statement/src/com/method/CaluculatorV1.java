package com.method;
import java.util.Scanner;

public class CaluculatorV1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st num");
		double a=sc.nextDouble();
		
		System.out.println("enter 12nd num");
		double b=sc.nextDouble();
		
		System.out.println("enter operation");
		char operation=sc.next().charAt(0);
		
		if(operation=='+') {
			double result = Arthimatic_calV1.add(a,b);
			System.out.println("additional is"+result);
						
		} else {
			if(operation=='-') {
				double result = Arthimatic_calV1.sub(a,b);
				System.out.println("Subtraction is"+result);
				
			}else {
				if(operation=='*') {
					double result = Arthimatic_calV1.mul(a,b);
					System.out.println("multiplication  is"+result);
					
				} else {
					if(operation=='/') {
						double result = Arthimatic_calV1.div(a,b);
						System.out.println("division  is"+result);
						
					}else {
						if(operation=='%') {
							double result = Arthimatic_calV1.mod(a,b);
							System.out.println("remainder  is"+result);
							
						}else {
							System.out.println("invalid operation........");
						}
						
					}
				}
			}
		}
		

	}

}
