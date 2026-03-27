package com.version1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithemeticExample {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		try {
			System.out.println("enter a value");
			double a = obj.nextDouble();
			
			System.out.println("enter b value");
			double b = obj.nextDouble();
			
			
			
			double c=a/b;
			
			System.out.println("Division is"+c);
			
		}
		catch(InputMismatchException e) {
			System.out.println("Hello user please check input....");
		}
		catch(ArithmeticException e) {
			System.out.println("Hello user don't enter b value as zero...");
		}
		catch(Exception e) {
			System.out.println("e");
		}
		
	}

}
